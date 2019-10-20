<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/10/2019
  version 2.0.0.00
--%>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <g:render template="/layouts/head"/>
        <script type="text/javascript">
            /*console.log("Rent E Car Create");*/
            BDC.baseURL = "${BDCUIHelper.appBaseURL()}";
            <g:if test="${flash?.message && flash?.message?.info}">
            jQuery(document).ready(function () {
                BDC.messageBox.showMessage(Boolean(${flash.message?.success}), "${flash.message?.info}");
            });
            </g:if>
        </script>
        <g:layoutHead/>
    </head>

    <body>
        <div class="wrapper fadeInDown">
            <div id="formContent">
                <g:layoutBody/>
            </div>
        </div>
    <g:render template="/layouts/footer"/>
    </body>
</html>
