<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="video-create.css">
    <title>Create a video</title>
</head>
<body>
    <form action="" method="POST" id="create-video">
        <div>
            <label for="username">Username</label>
            <input type="text" name="username" id="=username" value="${ username }">
            <div class="error-message">${ validationErrors['Username'] }</div>
        </div>
        <div>
            <label for="title">Video title</label>
            <input type="text" name="title" id="=title" value="${ title }">
            <div class="error-message">${ validationErrors['Title'] }</div>
        </div>
        <div>
            <label for="description">Video description</label>
            <textarea name="description" id="description" cols="30" rows="10" value="${ description }"></textarea>
            <div class="error-message">${ validationErrors['Description'] }</div>
        </div>
        <div>
            <label for="urlvideo">URL of the video</label>
            <input type="text" name="urlvideo" id="=urlvideo" value="${ urlvideo }">
            <div class="error-message">${ validationErrors['URL of the video'] }</div>
        </div>
        <div>
            <label for="urlminiatuture">URL of the thumbnail</label>
            <input type="text" name="urlminiatuture" id="=urlminiatuture" value="${ urlminiature }">
            <div class="error-message">${ validationErrors['URL of the thumbnail'] }</div>
        </div>
        <div>
            <label for="duration">Duration of the video</label>
            <input type="text" name="duration" id="=duration" value="${ duration }">
            <div class="error-message">${ validationErrors['Duration'] }</div>
        </div>
        <div>
            <input type="submit" value="Create my video">
        </div>
    </form>
</body>
</html>