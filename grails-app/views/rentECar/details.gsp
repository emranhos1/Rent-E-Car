<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/11/2019
  version 2.0.0.00
--%>

<!doctype html>
<html>
    <head>
        <meta name="layout" content="admin"/>
    </head>
    <body>
        <div class="adminWrapper fadeInDown">
            <div id="adminFormContent">
                <div class="card">
                    <div class="card-header fadeIn first">
                        <g:message code="rentECar" args="['Details']"/>
                    </div>
                    <div class="card-body">
                        <g:if test="${rentECar}">
                            <h4>Details of ${rentECar.firstName} ${rentECar.lastName}</h4>
                            <table class="table fadeIn first">
                                <tr>
                                    <th class="text-right"><g:message code="email"/></th><td class="text-left">${rentECar.email}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="mobile.no"/></th><td class="text-left">${rentECar.mobileNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="nid.no"/></th><td class="text-left">${rentECar.nidNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="business.name"/></th><td class="text-left">${rentECar.businessName}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="business.address"/></th><td class="text-left">${rentECar.businessAddress}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="tin.no"/></th><td class="text-left">${rentECar.tinNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="trade.licence"/></th><td class="text-left">${rentECar.tradLicence}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="entry.date"/></th><td class="text-left">${rentECar.entryDate}</td>
                                </tr>
                            </table>
                        </g:if>
                        <div class="form-action-panel fadeIn first">
                            <g:link controller="rentECar" action="index" class="btn btn-primary"><g:message code="back"/></g:link>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>


