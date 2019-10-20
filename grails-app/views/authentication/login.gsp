<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/9/2019
  version 2.0.0.00
--%>

<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        <g:message code="admin" args="['Login']"/>
    </div>
    <div class="card-body">
        <g:form controller="authentication" action="doLogin">
            <g:render template="form"/>
            <div class="form-action-panel">
                <g:submitButton class="btn btn-primary" name="login" value="${g.message(code: "login")}"/>
            </div>
        </g:form>
        <div id="formFooter">

        </div>
    </div>
</div>