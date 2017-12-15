/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
import model.dao.DenArmaPerdidaDAO;
import model.dao.impl.DenArmaPerdidaDAOimpl;
import model.dto.DenArmaPerdida;

/**
 *
 * @author 31424836
 */
public class LogicDenArma {
    
    private LogicDenArma() {
    }
    
    public static LogicDenArma getInstance() {
        return LogicDenArmaHolder.INSTANCE;
    }
    
    private static class LogicDenArmaHolder {

        private static final LogicDenArma INSTANCE = new LogicDenArma();
    }
    
    public List<DenArmaPerdida> getArmaperdida(String serie) throws Exception{
        List<DenArmaPerdida> lista=null;
        DenArmaPerdidaDAO dao=new DenArmaPerdidaDAOimpl();
        lista=dao.getDenArmaPerdidaxSerie(serie);
        return lista;
    }
    
}
