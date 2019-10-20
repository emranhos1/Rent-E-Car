<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/9/2019
  version 2.0.0.00
--%>
<div class="form-group">
    <g:textField name="username" class="form-control" value="${admin?.username}" placeholder="${g.message(code: "username")}"/>
    <BDCUIHelper:renderErrorMessage fieldName="username" model="${admin}" errorMessage="please.username"/>
</div>

<div class="form-group">
    <g:passwordField name="password" class="form-control" value="${admin?.password}" placeholder="${g.message(code: "password")}"/>
    <BDCUIHelper:renderErrorMessage fieldName="password" model="${admin}" errorMessage="please.password"/>
</div>