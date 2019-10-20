<%--
  Created by IntelliJ IDEA.
  User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
  Date: 10/9/2019
  version 2.0.0.00
--%>
<!doctype html>
<html>
    <head>
        <meta name="layout" content="admin"/>
        <title></title>
    </head>
    <body>
        <div class="adminWrapper fadeInDown">
            <div id="adminFormContent">
                <h3>Welcome To Basic Data Entry System</h3>
                <div class="card">
                    <div class="card-header">
                        <span class="float-left">
                            <g:message code="rentECar" args="['List']"/>
                        </span>
                    </div>

                    <div class="card-body">
                        <table class="table table-bordered fadeIn second">
                            <thead class="thead-dark">
                            <tr>
                                <g:sortableColumn property="firstName" title="${g.message(code: "first.name")}"/>
                                <g:sortableColumn property="lastName" title="${g.message(code: "last.name")}"/>
                                <g:sortableColumn property="email" title="${g.message(code: "email")}"/>
                                <g:sortableColumn property="mobileNo" title="${g.message(code: "mobile.no")}"/>
                            </tr>
                            </thead>
                            <tbody>
                            <g:each in="${rentECarList}" var="info">
                                <tr>
                                    <td>${info?.firstName}</td>
                                    <td>${info?.lastName}</td>
                                    <td>${info?.email}</td>
                                    <td>${info?.mobileNo}</td>
                                </tr>
                            </g:each>
                            </tbody>
                        </table>

                        <div class="paginate fadeIn third">
                            <g:paginate total="${total ?: 0}" />
                        </div>
                    </div>
                </div>

                <div class="card">
                    <div class="card-header">
                        <span class="float-left">
                            <g:message code="outlet" args="['List']"/>
                        </span>
                    </div>
                    <div class="card-body">
                        <table class="table table-bordered fadeIn second">
                            <thead class="thead-dark">
                            <tr>
                                <g:sortableColumn property="firstName" title="${g.message(code: "first.name")}"/>
                                <g:sortableColumn property="lastName" title="${g.message(code: "last.name")}"/>
                                <g:sortableColumn property="email" title="${g.message(code: "email")}"/>
                                <g:sortableColumn property="mobileNo" title="${g.message(code: "mobile.no")}"/>
                            </tr>
                            </thead>
                            <tbody>
                            <g:each in="${outletList}" var="info">
                                <tr>
                                    <td>${info?.firstName}</td>
                                    <td>${info?.lastName}</td>
                                    <td>${info?.email}</td>
                                    <td>${info?.mobileNo}</td>
                                </tr>
                            </g:each>
                            </tbody>
                        </table>
                        <div class="paginate fadeIn third">
                            <g:paginate total="${total ?: 0}" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>


