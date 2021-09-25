<rn:meta title="#rn:msg:SUPPORT_LOGIN_HDG#" template="standard.php" login_required="false" redirect_if_logged_in="account/overview" force_https="true" />

<div id="rn_PageTitle" class="rn_Account">
    <h1>#rn:msg:LOG_IN_UC_LBL#</h1>
</div>

<div id="rn_PageContent" class="rn_Account rn_LoginForm">
    <div class="rn_Padding">
        <br/>
        <div class="rn_Column rn_LeftColumn">
            <h2>#rn:msg:LOG_IN_WITH_AN_EXISTING_ACCOUNT_LBL#</h2><br/>
            <rn:widget path="login/LoginForm2" redirect_url="/app/account/overview"/>
            <br/>
            <a href="/app/#rn:config:CP_ACCOUNT_ASSIST_URL##rn:session#">#rn:msg:FORGOT_YOUR_USERNAME_OR_PASSWORD_MSG#</a>
            <br/><br/>
            #rn:msg:NOT_REGISTERED_YET_MSG#
            <a href="/app/utils/create_account/redirect/<?=urlencode(getUrlParm('redirect'));?>#rn:session#">#rn:msg:SIGN_UP_LBL#</a>
        </div>
    </div>
</div>
