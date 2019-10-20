<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/10/2019
  version 2.0.0.00
--%>
<meta name="layout" content="admin"/>

<div class="wrapper fadeInDown">
    <div id="formContent">
        </br>
        <div class="fadeIn first">
            <g:img dir="images" file="bdc/bdc48x48.png"/>
        </div>
        </br>
        <g:form controller="rentECar" action="create">
            <g:submitButton name="rentECar" class="btn btn-lg btn-primary buttonRO" value="${g.message(code: "rent.e.car.reg")}"/>
        </g:form>
        <g:form controller="outlet" action="create">
            <g:submitButton name="outlet" class="btn btn-lg btn-primary buttonRO" value="${g.message(code: "outlet.reg")}"/>
        </g:form>
        <div id="formFooter">
            <div class="fadeIn first">
                <h6>Basic Data Entry Forms</h6>
                <h6>For Rent-E-Car Service</h6>
            </div>
        </div>
    </div>
</div>
