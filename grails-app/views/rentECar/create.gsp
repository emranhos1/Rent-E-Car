<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/7/2019
  version 2.0.0.00
--%>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta name="layout" content="admin"/>
        <script type="text/javascript">
            /*console.log("Rent E Car Create");*/
            BDC.baseURL = "${BDCUIHelper.appBaseURL()}";
            <g:if test="${flash?.message && flash?.message?.info}">
            jQuery(document).ready(function () {
                BDC.messageBox.showMessage(Boolean(${flash.message?.success}), "${flash.message?.info}");
            });
            </g:if>
        </script>
    </head>

    <body>
        <div class="rentECarWrapper fadeInDown">
            <div id="rentECarFormContent">
                <div class="card">
                    <div class="card-header">
                        <g:message code="rentECar" args="['Registration']"/>
                    </div>
                    <div class="card-body">
                        <g:form controller="rentECar" action="save">

                            <g:render template="form"/>
                            <div class="form-action-panel">
                                <g:submitButton class="btn btn-primary" name="save" value="${g.message(code: "save")}"/>
                                <g:field type="reset" class="btn btn-outline-danger" name="reset" value="${g.message(code: "reset")}"/>
                            </div>
                        </g:form>
                        <div id="formFooter">
                            Go Back : <g:link controller="main" action="index" class="underlineHover">${g.message(code: "click.here")}</g:link>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>