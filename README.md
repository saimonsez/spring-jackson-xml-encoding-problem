Demo of wrong encoding using spring with jackson-dataformat-xml. 
DemoApi produces "text/xml;charset=ISO-8859-1" but AbstractJackson2HttpMessageConverter's writeInternal 
method uses JsonEncoding witch only supports unicode.
