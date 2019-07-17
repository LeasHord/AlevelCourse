<#import "parts/common.ftl" as c>

<@c.page>
    <div class="mb-1">Registration form</div>

    <form action="/registration" method="post">

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">User Name :</label>
            <div class="col-sm-6">
                <input type="text" name="username" value="<#if user??>${user.username}</#if>"
                class="form-control ${(usernameError??)?string('is-invalid', '')}"
                placeholder="User name" />
                <#if usernameError??>
                    <div class="invalid-feedback">
                    ${usernameError}
                    </div>
                </#if>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> First Name :</label>
            <div class="col-sm-6">
                <input type="text" name="firstName" value="<#if user??>${user.firstName}</#if>"
                       class="form-control" placeholder="First name"/>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> Last Name :</label>
            <div class="col-sm-6">
                <input type="text" name="lastName" value="<#if user??>${user.lastName}</#if>"
                       class="form-control" placeholder="Last name"/>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Email:</label>
            <div class="col-sm-6">
                <input type="email" name="email" value="<#if user??>${user.email}</#if>"
                class="form-control ${(emailError??)?string('is-invalid', '')}"
                placeholder="some@some.com" />
                <#if emailError??>
                    <div class="invalid-feedback">
                    ${emailError}
                    </div>
                </#if>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Password:</label>
            <div class="col-sm-6">
                <input type="password" name="password"
                class="form-control ${(passwordError??)?string('is-invalid', '')}"
                placeholder="Password" />
                <#if passwordError??>
                    <div class="invalid-feedback">
                    ${passwordError}
                    </div>
                </#if>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Confirm Password:</label>
            <div class="col-sm-6">
                <input type="password" name="confirmPassword"
                class="form-control ${(confirmPasswordError??)?string('is-invalid', '')}"
                placeholder="Retype password" />
                <#if confirmPasswordError??>
                    <div class="invalid-feedback">
                    ${confirmPasswordError}
                    </div>
                </#if>
            </div>
        </div>

        <div class="col-sm-6">
            <div class="g-recaptcha" data-sitekey="6LeYoa0UAAAAAAjf9YBbAc0WEw7fBCQNoaub9SUD"></div>
            <#if captchaError??>
            <div class="alert alert-danger" role="alert">
                ${captchaError}
            </div>
            </#if>
        </div>

        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <div><input type="submit" value="Registration"/></div>
    </form>
</@c.page>