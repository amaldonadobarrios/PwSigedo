/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import model.dao.ResumenrnspDAO;
import model.dto.ResumenRNSP;
import org.apache.log4j.Logger;
import util.Util;
import util.UtilConection;

/**
 *
 * @author 31424836
 */
public class ResumenrnspDAOimpl implements ResumenrnspDAO {

    final Logger logger = Logger.getLogger(ResumenrnspDAOimpl.class);
    Util uti = new Util();
    Connection cn = null;
    UtilConection db = new UtilConection();

    @Override
    public ResumenRNSP getResumen() throws Exception {
        ResumenRNSP resumen = null;
        String sqlResult = "";
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            cn = db.getConnection();
            sqlResult = uti.getLocalResource("/sql/callresumen.sql");
        } catch (SQLException ex) {
            logger.error(ex);
            throw new Exception("Problemas del sistema...");
        } catch (Throwable ex) {
            logger.error(ex);
        }

        if (cn != null) {

            try {

                cstmt = cn.prepareCall(sqlResult);
                cstmt.execute();
                rs = cstmt.getResultSet();
                if (rs.next()) {
                    resumen = new ResumenRNSP();    
                    resumen.setDenasarobveh(rs.getString("t_den_robo_vehiculos"));
                    resumen.setDendesapa(rs.getString("t_den_per_desaparecidas"));
                    resumen.setDenfalconpat(rs.getString("t_den_f_contra_patrimonio"));
                    resumen.setDenfalconper(rs.getString("t_den_f_contra_personas"));
                    resumen.setDenleviofam(rs.getString("t_den_lesiones_v_familiar"));
                    resumen.setDenleyproviofam(rs.getString("t_den_proteccion_v_familiar"));
                    resumen.setDentrata(rs.getString("t_den_trata_personas"));
                    resumen.setDetdenu(rs.getString("t_den_detenidos"));
                    resumen.setTotdenperarma(rs.getString("t_den_perdida_armas"));
                    resumen.setTotdenuncia(rs.getString("t_den"));
                }
            } catch (SQLException e) {
                logger.error(e);
                throw new Exception("Problemas del sistema...");
            } finally {
                try {
                    cn.close();
                    System.out.println("DB Connection close");
                } catch (SQLException ex) {
                    logger.error(ex);
                }
            }
        }
        return resumen;
    }
}
