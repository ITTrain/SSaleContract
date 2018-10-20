<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>按钮 样式演示</title>
<!-- JQuery 導入 -->
<script type="text/javascript" src="static/js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<!-- Bootstrap CSS導入 -->
<link href="static/bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="static/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <button>登録</button>
    </br>
    <!-- Standard button -->
    <button type="button" class="btn btn-default">（默认样式）Default</button>
    </br>

    <!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
    <button type="button" class="btn btn-primary">（首选项）Primary</button>
    </br>
    <!-- Indicates a successful or positive action -->
    <button type="button" class="btn btn-success">（成功）Success</button>
    </br>
    <!-- Contextual button for informational alert messages -->
    <button type="button" class="btn btn-info">（一般信息）Info</button>
    </br>
    <!-- Indicates caution should be taken with this action -->
    <button type="button" class="btn btn-warning">（警告）Warning</button>
    </br>
    <!-- Indicates a dangerous or potentially negative action -->
    <button type="button" class="btn btn-danger">（危险）Danger</button>
    </br>
    <!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
    <button type="button" class="btn btn-link">（链接）Link</button>
</body>
</html>