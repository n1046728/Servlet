擷取資訊
--------
1. Servlet info
```
GenericServlet-->|-Servlet
				 |-ServletConfig

getInitParameter()
getInitParamterNames()
getServletName()
gerServletContext()
```
2. Server Info
```
req.getServerName()
req.getServerPort()

context.setAttribute()
context.getAttribute()
context.removeAttribute()
context.getAttributeNames()
註:javaz.servlet.context.tempdir為server被強制規定要有的屬性名稱
DB應用：
getServletContext().getInitParameter("connection.driver")
getServletContext().getInitParameter("connection.url")
getServletContext().getInitParameter("connection.UserName")
getServletContext().getInitParameter("connection.Password")
```
3. Client Info
```
req.getRemoteAddr()
req.getRemoteHost()

req.getParameter()
req.getParameterValues()
req.getParameterNames()
req.getQueryString()
```
