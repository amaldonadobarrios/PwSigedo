<%-- 
    Document   : denap
    Created on : 09/11/2017, 06:48:49 PM
    Author     : 31424836
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="row">
                <div class="col-xs-6 col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-body easypiechart-panel">
                            <h4>New Orders</h4>
                            <div class="easypiechart" id="easypiechart-blue" data-percent="92" ><span class="percent">92%</span></div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-body easypiechart-panel">
                            <h4>Comments</h4>
                            <div class="easypiechart" id="easypiechart-orange" data-percent="65" ><span class="percent">65%</span></div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-body easypiechart-panel">
                            <h4>New Users</h4>
                            <div class="easypiechart" id="easypiechart-teal" data-percent="56" ><span class="percent">56%</span></div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-6 col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-body easypiechart-panel">
                            <h4>Detenidos</h4>
                            <div class="easypiechart" id="easypiechart-red" data-percent="100" ><span class="percent">27</span></div>
                        </div>
                    </div>
                </div>
            </div><!--/.row-->
            ${grilla}
        </div>
    </div>
</div>
<script>
    $('#dynamic-table').DataTable({
        responsive: true
    });
</script>
