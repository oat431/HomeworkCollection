<?php
$uri = parse_url($_SERVER['REQUEST_URI'], PHP_URL_PATH);
$uri = explode('/', $uri);

if (isset($uri[4])) {
    $name = $uri[4];
}


include __DIR__."./include/DatabaseConnection.php";
include __DIR__."./include/DatabaseFunction.php";

if ($_SERVER['REQUEST_METHOD'] == 'GET') {
    if ($name != null) {
        $response = search($pdo, $name);
    } else {
        $response = showlist($pdo);
    }
} elseif ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $input = (array) json_decode(file_get_contents('php://input'), TRUE);
    $response = add($pdo, $input);
} else {
    http_response_code(400);
} 

echo $response;
// header($response['status_code_header']);

// if ($response['body']) {
//     echo $response['body'];
// }
