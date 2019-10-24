$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("criarconta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "#encoding UTF-8"
    }
  ],
  "line": 5,
  "name": "Criar Conta no Site",
  "description": "              Eu como usuario gostaria\r\n              de criar uma conta no site",
  "id": "criar-conta-no-site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@geral"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Criar conta no site com sucesso",
  "description": "",
  "id": "criar-conta-no-site;criar-conta-no-site-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 10,
  "name": "que o usuario preenche os dados",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "os dados estão corretos",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o usuario e cadastrado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarContasSteps.que_o_usuario_preenche_os_dados()"
});
formatter.result({
  "duration": 30085760900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\"header_user_info\"]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NOTE_PE046A34\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\DANIEL~1.MAC\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:59713}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f3df1515b2fafa9cd3f331c26a934733\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\"header_user_info\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat br.com.aprendendoautomatizar.funcionalidade.HomeFuncionalidade.clicarBotaoSignIn(HomeFuncionalidade.java:15)\r\n\tat br.com.aprendendoautomatizar.steps.CriarContasSteps.que_o_usuario_preenche_os_dados(CriarContasSteps.java:21)\r\n\tat ✽.Dado que o usuario preenche os dados(criarconta.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CriarContasSteps.os_dados_estão_corretos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CriarContasSteps.o_usuario_e_cadastrado_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
});