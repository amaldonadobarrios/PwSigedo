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
import java.util.ArrayList;
import java.util.List;
import model.dao.DenArmaPerdidaDAO;
import model.dto.DenArmaPerdida;
import org.apache.log4j.Logger;
import util.Util;
import util.UtilConection;

/**
 *
 * @author 31424836
 */
public class DenArmaPerdidaDAOimpl  implements DenArmaPerdidaDAO{
  final Logger logger = Logger.getLogger(DenArmaPerdidaDAOimpl.class);
    Util uti = new Util();
    Connection cn = null;
    UtilConection db = new UtilConection();
    @Override
    public List<DenArmaPerdida> getDenArmaPerdidaxSerie(String serie) throws Exception {
        DenArmaPerdida den = null;
        List<DenArmaPerdida> lista=null;
         String sqlResult = "";
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            cn = db.getConnection();
            sqlResult = uti.getLocalResource("/sql/calldenarmaSerie.sql");
        } catch (SQLException ex) {
            logger.error(ex);
            throw new Exception("Problemas del sistema...");
        } catch (Throwable ex) {
            logger.error(ex);
        }

        if (cn != null) {

            try {

                cstmt = cn.prepareCall(sqlResult);
                cstmt.setString(1,serie); 
                cstmt.execute();
                rs = cstmt.getResultSet();
                lista=new ArrayList<DenArmaPerdida>();
                if (rs.next()) {
                    den = new DenArmaPerdida();    
                    den.setComisaria_pnp(rs.getString(1));
                    den.setDescri_modalidad(rs.getString(2));
                    den.setDescri_sub_tipo(rs.getString(3));
                    den.setEstado_arma(rs.getString(4));
                    den.setEstado_denuncia(rs.getString(5));
                    den.setFec_hora_hecho(rs.getString(6));
                    den.setFec_hora_registro(rs.getString(7));
                    den.setId_arma(rs.getString(8));
                    den.setId_denuncia(rs.getString(9));
                    den.setMarca_arma(rs.getString(10));
                    den.setObservaciones(rs.getString(11));
                    den.setOrigen(rs.getString(12));
                    den.setRegion_pnp(rs.getString(13));
                    den.setSerie_arma(rs.getString(14));
                    den.setTipo_arma(rs.getString(15));
                    den.setTipo_denuncia(rs.getString(16));
                  lista.add(den);
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
        return lista;
        
        
        
    }
    
}
