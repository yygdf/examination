/**生成一个随机数**/
function randomNum(min, max) {
    return Math.floor(Math.random() * (max - min) + min);
}

/**生成一个随机色**/
function randomColor(min, max) {
    var r = randomNum(min, max);
    var g = randomNum(min, max);
    var b = randomNum(min, max);
    return "rgb(" + r + "," + g + "," + b + ")";
}

/**绘制验证码图片**/
function drawPic(show_num) {
    var canvas = document.getElementById("canvas");
    var width = canvas.width;
    var height = canvas.height;
    var ctx = canvas.getContext('2d');
    ctx.clearRect(0,0,width,height);// 绘画前清空上一次的内容
    ctx.textBaseline = 'bottom';

    /**绘制背景色**/
    // ctx.fillStyle = randomColor(255, 255); // 颜色若太深可能导致看不清
    ctx.fillStyle = "rgba(255, 255, 255, 0)"; // 透明背景
    ctx.fillRect(0, 0, width, height);
    /**绘制文字**/
    var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
    var aCode = sCode.split(",");
    for (var i = 0; i < 4; i++) {
        var txt = aCode[randomNum(0, aCode.length)];// 得到随机的一个内容
        show_num[i] = txt.toLowerCase();
        ctx.fillStyle = randomColor(50, 160); // 随机生成字体颜色
        ctx.font = randomNum(15, 40) + 'px SimHei'; // 随机生成字体大小
        var x = 10 + i * 25;
        var y = randomNum(25, 45);
        var deg = randomNum(-45, 45);
        // 修改坐标原点和旋转角度
        ctx.translate(x, y);
        ctx.rotate(deg * Math.PI / 180);
        ctx.fillText(txt, 0, 0);
        //恢复坐标原点和旋转角度
        ctx.rotate(-deg * Math.PI / 180);
        ctx.translate(-x, -y);
    }
}

// layer弹出层
function errorMsg(msg) {
    layer.msg(msg, {offset:'t'});
}