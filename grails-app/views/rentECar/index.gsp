<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/7/2019
  version 2.0.0.00
--%>

<!doctype html>
<html>
    <head>
        <meta name="layout" content="admin"/>
        <script type="text/javascript">
            %{--console.log("${BDCUIHelper.appBaseURL()}");--}%
            BDC.baseURL = "${BDCUIHelper.appBaseURL()}";
            <g:if test="${flash?.message && flash?.message?.info}">
            jQuery(document).ready(function () {
                BDC.messageBox.showMessage(Boolean(${flash.message?.success}), "${flash.message?.info}");
            });
            </g:if>
        </script>
    </head>
    <body>
        <div class="adminWrapper fadeInDown">
            <div id="adminFormContent">
                <div class="card">
                    <div class="card-header">
                        <span class="float-left">
                            <g:message code="rentECar" args="['List']"/>
                        </span>
                    </div>

                    <div class="card-body">
                        <table class="table table-bordered fadeIn second">
                            <thead class="thead-dark">
                            <tr>
                                <g:sortableColumn property="firstName" title="${g.message(code: "first.name")}"/>
                                <g:sortableColumn property="lastName" title="${g.message(code: "last.name")}"/>
                                <g:sortableColumn property="email" title="${g.message(code: "email")}"/>
                                <g:sortableColumn property="mobileNo" title="${g.message(code: "mobile.no")}"/>
                                <th class="action-row"><g:message code="action"/></th>
                            </tr>
                            </thead>
                            <tbody>
                            <g:each in="${rentECarList}" var="info">
                                <tr>
                                    <td>${info?.firstName}</td>
                                    <td>${info?.lastName}</td>
                                    <td>${info?.email}</td>
                                    <td>${info?.mobileNo}</td>
                                    <td>
                                        <div class="btn-group">
                                            <g:link controller="rentECar" action="details" class="btn btn-secondary" id="${info.id}"><i class="fas fa-eye"></i></g:link>
                                            <g:link controller="rentECar" action="edit" class="btn btn-secondary" id="${info.id}"><i class="fas fa-edit"></i></g:link>
                                            <g:link controller="rentECar" action="delete" id="${info.id}" class="btn btn-secondary delete-confirmation"><i class="fas fa-trash"></i></g:link>
                                        </div>
                                    </td>
                                </tr>
                            </g:each>
                            </tbody>
                        </table>

                        <div class="paginate fadeIn third">
                            <g:paginate total="${total ?: 0}" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
