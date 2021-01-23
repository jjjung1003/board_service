<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table width="500" align="center">
        <tr>
           <td> 번호 </td>
           <td> 작성자 </td>
           <td> 제목 </td>
           <td> 작성일 </td>
        </tr>
        <c:forEach items="${list}" var="bsvo">
            <tr>
               <td> ${bsvo.id} </td>
               <td> ${bsvo.name} </td>
               <td> <a href="content?id=${bsvo.id}"> ${bsvo.title} </a> </td>
               <td> ${bsvo.writeday} </td>
            </tr>
        </c:forEach>
        <tr>
         <td colspan="4">  <a href="write">글작성</a> </td>
        </tr>
     </table>
 
</body>
</html>