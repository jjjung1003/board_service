<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table width="400" align="center">
       <form method=post action=write_ok>
          <tr>
             <td> 이름 </td>
             <td> <input type=text name=name size=40> </td>
          </tr>
          <tr>
             <td> 제목 </td>
             <td> <input type=text name=title size=40> </td>
          </tr>
          <tr>
             <td> 내용 </td>
             <td> <textarea rows=5 cols=38 name=content></textarea> </td>
          </tr>
          <tr>
             <td> 비번 </td>
             <td> <input type=password name=pwd size=40> </td>
          </tr>
          <tr>
             <td colspan=2> <input type=submit value=입력> </td>
          </tr>
       </form>
     </table>
 
</body>
</html>