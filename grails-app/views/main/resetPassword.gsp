<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/22/2019
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
        <div class="wrapper fadeInDown">
            <div id="formContent">
                <div class="card">
                    <div class="card-header">
                        <g:message code="reset.password"/>
                    </div>
                    <div class="card-body">
                        <g:form controller="main" action="reset">
                            <g:render template="form"/>
                            <div class="form-action-panel">
                                <g:submitButton class="btn btn-primary" name="resetPassword" value="${g.message(code: "update")}"/>
                            </div>
                        </g:form>
                        <div id="formFooter">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

