<html>
<head>
    <title>AAAA</title>
    <script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .pageDetail {
            display: none;
        }

        .show {
            display: table-row;
        }
    </style>
</head>
<script>
	$(function (){
		alert(1);
	})

</script>
<body>
		H  I    ${name}  OK ?
		<table>
		  <#list booklist as emp>
                <tr>
                    <td>${emp.bookId}</td>
                    <td>${emp.bookName}</td>
                    <td>${emp.bookPrice}</td>
                    
                </tr>
                </#list>
		</table>
</body>
<script >
function updateHrm(ss){
alert(ss);
}
</script>
</html>