<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/8/2019
  version 2.0.0.00
--%>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta name="layout" content="admin"/>
        <script type="text/javascript">
            BDC.baseURL = "${BDCUIHelper.appBaseURL()}";
            <g:if test="${flash?.message && flash?.message?.info}">
            jQuery(document).ready(function () {
                BDC.messageBox.showMessage(Boolean(${flash.message?.success}), "${flash.message?.info}");
            });
            </g:if>
        </script>
    </head>
    <body>
        <div class="outletWrapper fadeInDown">
            <div id="outletFormContent">
                <div class="card">
                    <div class="card-header">
                        <g:message code="outlet" args="['Update']"/>
                    </div>
                    <div class="card-body fadeIn second">
                        <g:form controller="outlet" action="update">
                            <g:hiddenField name="id" value="${outlet.id}"/>
                            <g:render template="form" model="[edit:'yes']"/>
                            <div class="form-action-panel">
                                <g:submitButton class="btn btn-primary" name="update" value="${g.message(code: "update")}"/>
                            </div>
                        </g:form>
                        <div id="formFooter">
                            Go Back : <g:link controller="outlet" action="index" class="underlineHover">${g.message(code: "click.here")}</g:link>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

