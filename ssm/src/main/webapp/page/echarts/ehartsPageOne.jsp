<%--
  Created by IntelliJ IDEA.
  User: ysw
  Date: 2019/8/21
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>echarts1</title>
    <!-- 引入 echarts.js -->
    <script src="/echarts/echarts.min.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
</body>

<script>

    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: 'ECharts 入门示例'
        },
        tooltip: {//tooltip ： 鼠标移上去有提示
            formatter:function (perms) {
                return perms.seriesName+"</br>"+colorChange(perms.seriesName)+perms.name+":"+perms.value
            }
        },
        legend: { //legend ：显示图表外面可以点击的按钮（相应的图表数据会发生变化）
            data:['销量','test1']
        },
        xAxis: {
            data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',//表示柱状图,type能为空
            data: [5, 20, 36, 10, 10, 20]
        },{
            name: 'test1',//系列名称，如启用legend，该值将被legend.data索引相关
            type: 'bar',
            data: [5, 20, '-', 10, 10, 20]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);


    function colorChange(name) {
        if(name=='销量'){
            return '<span style="display:inline-block;margin-right:5px;border-radius:10px;width:10px;height:10px;background-color:#c23531;"></span>';
        }else{
            return '<span style="display:inline-block;margin-right:5px;border-radius:10px;width:10px;height:10px;background-color:#2f4554;"></span>';
        }
    }
</script>
</html>
