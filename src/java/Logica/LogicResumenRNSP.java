/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import model.dao.ResumenrnspDAO;
import model.dao.impl.ResumenrnspDAOimpl;
import model.dto.ResumenRNSP;

/**
 *
 * @author 31424836
 */
public class LogicResumenRNSP {
    
    private LogicResumenRNSP() {
    }
    
    public static LogicResumenRNSP getInstance() {
        return LogicResumenRNSPHolder.INSTANCE;
    }
    
    private static class LogicResumenRNSPHolder {

        private static final LogicResumenRNSP INSTANCE = new LogicResumenRNSP();
    }
     public ResumenRNSP getResumen() throws Exception{
        ResumenRNSP resumen;
        ResumenrnspDAO dao=new ResumenrnspDAOimpl();
        resumen=dao.getResumen();
        return resumen;   
    }
}
