<%-- 
    Document   : home
    Created on : 09/11/2017, 04:36:55 PM
    Author     : 31424836
--%>
<script src="js/js1/easypiechart.js" type="text/javascript"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="row">
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-teal panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de Antecedentes Policiales</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-blue panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de referencia policiales</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-orange panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">${objResumen.totdenperarma}</div>
                            <div class="text-muted">Registro de armas perdidas</div>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-red panel-widget ">
                        <div class="row no-padding"><em class="fa fa-xl fa fa-car color-red"></em>
                            <div class="large">${objResumen.denasarobveh}</div>
                            <div class="text-muted">Registro de vehiculos robados</div>
                        </div>
                    </div>
                </div>
            </div><!--/.row-->
            <div class="row">
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-teal panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">${objResumen.dendesapa}</div>
                            <div class="text-muted">Registro de personas desaparecidas</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-blue panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">${objResumen.dentrata}</div>
                            <div class="text-muted">Registro del delito de trata de personas y afines</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-orange panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de bienes culturales sustraidos</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-red panel-widget ">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de pasaportes sustraidos o perdidos</div>
                        </div>
                    </div>
                </div>
            </div><!--/.row-->
            <div class="row">
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-teal panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de documentos Oficiales sustraidos o perdidos</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-blue panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de vehículos, naves o aeronaves empleadas para la comision de ilícitos penales</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-orange panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de personas jurídicas utilizadas para la comisión de delitos</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-red panel-widget ">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de identidad balística</div>
                        </div>
                    </div>
                </div>
            </div><!--/.row-->
            <div class="row">
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-teal panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de identidad dactilar del delincuente</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-blue panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">null</div>
                            <div class="text-muted">Registro de infractores a la Ley General de Transporte y Tránsito terrestre</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3 col-lg-3 no-padding">
                    <div class="panel panel-orange panel-widget border-right">
                        <div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
                            <div class="large">${objResumen.detdenu}</div>
                            <div class="text-muted">Registro de detenidos</div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-body easypiechart-panel">
                            <h4>Denuncias por perdida de Armas</h4>
                            <div class="easypiechart" id="easypiechart-blue" data-percent="50" ><span class="percent">${objResumen.totdenperarma}</span></div>
                        </div>
                    </div>
                </div>
            </div><!--/.row-->
        </div>
    </div>
</div>


	

	
	