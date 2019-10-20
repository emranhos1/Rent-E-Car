<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/7/2019
  version 2.0.0.00
--%>
<div class="col-lg-12">
    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="firstName" class="form-control" value="${outlet?.firstName}" placeholder="${g.message(code: "first.name")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="firstName" model="${outlet}" errorMessage="please.enter.first.name"/>
    </div>

    <div class="form-group  col-lg-6" style="float: left">
        <g:textField name="lastName" class="form-control" value="${outlet?.lastName}" placeholder="${g.message(code: "last.name")}"/>
    </div>
</div>

<div class="col-lg-12">
    <g:if test="${!edit}">
        <div class="form-group col-lg-6" style="float: left">
            <g:field type="email" name="email" class="form-control" value="${outlet?.email}" placeholder="${g.message(code: "email")}"/>
            <BDCUIHelper:renderErrorMessage fieldName="email" model="${outlet}" errorMessage="enter.email"/>
        </div>

        <div class="form-group col-lg-6" style="float: left">
            <g:passwordField name="password" class="form-control" value="${outlet?.password}" placeholder="${g.message(code: "password")}"/>
            <BDCUIHelper:renderErrorMessage fieldName="password" model="${outlet}" errorMessage="enter.password"/>
        </div>
    </g:if>
</div>

<div class="col-lg-12">
    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="mobileNo" class="form-control" value="${outlet?.mobileNo}" placeholder="${g.message(code: "mobile.no")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="mobileNo" model="${outlet}" errorMessage="enter.your.mobile.no"/>
    </div>

    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="nidNo" class="form-control" value="${outlet?.nidNo}" placeholder="${g.message(code: "nid.no")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="nidNo" model="${outlet}" errorMessage="enter.your.nid.no"/>
    </div>
</div>

<div class="col-lg-12">
    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="businessName" class="form-control" value="${outlet?.businessName}" placeholder="${g.message(code: "business.name")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="businessName" model="${outlet}" errorMessage="enter.your.business.name"/>
    </div>

    <div class="form-group col-lg-6" style="float: left">
        <g:textArea name="businessAddress" class="form-control" value="${outlet?.businessAddress}" placeholder="${g.message(code: "business.address")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="businessAddress" model="${outlet}" errorMessage="enter.your.business.address"/>
    </div>
</div>

<div class="col-lg-12">
    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="tradeLicence" class="form-control" value="${outlet?.tradeLicence}" placeholder="${g.message(code: "trade.licence")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="tradeLicence" model="${outlet}" errorMessage="enter.your.trade.licence"/>
    </div>

    <div class="form-group col-lg-6" style="float: left">
        <g:textField name="tinNo" class="form-control" value="${outlet?.tinNo}" placeholder="${g.message(code: "tin.no")}"/>
        <BDCUIHelper:renderErrorMessage fieldName="tinNo" model="${outlet}" errorMessage="enter.your.tin.no"/>
    </div>
</div>