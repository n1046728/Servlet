# test01
## MyCounter1
1. Anotation setting url-pattern 
2. web.xml setting url-pattern
3. Setting 1&&2 will use web.xml if u set metadata-complete='true' in web.xml
4. Setting <load-on-startup>tag and set value >0(default -1) in web.xml. This Servlet will loaded when server startup.
## MyCounter2
   URL Mapping 
   * http://主機:port/<Servlet Context Path>/XXX.html    ->明確對應
   * http://主機:port/<Servlet Context Path>/XXX.html/*  ->前置路徑對應
   * http://主機:port/<Servlet Context Path>/*.html      ->延伸檔名對應 
## MyCounter3 
   initParam
## MyCounter4
   Sychronization test open two ie to test ,it will happen get the same count
   Solution:
   1. synchronized public void doGet().... not efficent
   2. synchronized(this){count++}.... handle critical section
   3. synchronized(this){ int local_count =++count}.... declare local variable 
   4. if program not necessary persist variable,u can use local variable to avoid race condition
## MyCounter5
   destroy method may let u save data to db or file that can helpful to use it next time.
# test02_formGetPost
## HelloWorld
   1.test1 mark res.setContentType("text/html; charset=UTF-8")-->garbled Chinese text
   2.test2 run program without method doGet-->HTTP Status 405 – Method Not Allowed
## HelloGet & formGet.html
   * u should know how to passvalue from html and html call servlet
## HelloPost & formPost
   * u should know how to set post method in html and know diffrent with get hot to passvalue
## formGet.jsp & formPost.jsp
   * know how to write jsp file
