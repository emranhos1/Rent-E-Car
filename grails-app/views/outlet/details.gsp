<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/8/2019
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
                        <g:message code="outlet" args="['Details']"/>
                    </div>
                    <div class="card-body">
                        <g:if test="${outlet}">
                            <h4 class="fadeIn second">Details of ${outlet.firstName} ${outlet.lastName}</h4>
                            <table class="table fadeIn third">
                                <tr>
                                    <th class="text-right"><g:message code="email"/></th><td class="text-left">${outlet.email}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="mobile.no"/></th><td class="text-left">${outlet.mobileNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="nid.no"/></th><td class="text-left">${outlet.nidNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="business.name"/></th><td class="text-left">${outlet.businessName}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="business.address"/></th><td class="text-left">${outlet.businessAddress}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="trade.licence"/></th><td class="text-left">${outlet.tradeLicence}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="tin.no"/></th><td class="text-left">${outlet.tinNo}</td>
                                </tr>
                                <tr>
                                    <th class="text-right"><g:message code="entry.date"/></th><td class="text-left">${outlet.entryDate}</td>
                                </tr>
                            </table>
                        </g:if>
                        <div class="form-action-panel fadeIn fourth">
                            <g:link controller="outlet" action="index" class="btn btn-primary"><g:message code="back"/></g:link>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>


