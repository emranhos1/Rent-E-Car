<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/22/2019
  version 2.0.0.00
--%>

<div class="form-group">
    <g:passwordField name="password" class="form-control" value="${admin?.password}" placeholder="${g.message(code: "password")}"/>
</div>

<div class="form-group">
    <g:passwordField name="password1" class="form-control" value="${params?.password1}" placeholder="${g.message(code: "password1")}"/>
</div>

<div class="form-group">
    <g:passwordField name="password2" class="form-control" value="${params?.password2}" placeholder="${g.message(code: "password2")}"/>
</div>