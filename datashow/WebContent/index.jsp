<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
</head>
<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>
<body>
	<input type="button" id="btn" value="点击" src="/airinfo/list.action"><br>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="height:400px"></div>
    <!-- ECharts单文件引入 -->
    <script src="js/dist/echarts.js"></script>
    <script type="text/javascript">
    	var x;
    	var y;
    	var num = 0;
	    $(function(){
	    	prepareData();
	    	setInterval(prepareData,5000);
		});
	    function prepareData(){
			$.ajax(
				{url : 'airinfo/list.action',
					type: 'post',
					data : {
						id : 1
					},
					datatype : 'json',
					success : function(data){
						num = num + 50;
						//------------
						var temp = eval('(' + data + ')');
						var jsonObj = eval('(' + temp + ')');
						x = new Array()
						y = new Array()
						x.push(jsonObj.departure)
						x.push(jsonObj.arrival)
						y.push(jsonObj.atime + num)
						y.push(jsonObj.dtime + num)
						//------------
						// 路径配置
				        require.config({
				            paths: {
				                echarts: 'js/dist'
				            }
				        });
				        
				        // 使用
				        require(
				            [
				                'echarts',
				                'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
				            ],
				            function (ec) {
				                // 基于准备好的dom，初始化echarts图表
				                var myChart = ec.init(document.getElementById('main')); 
				                
				                var option = {
				                    tooltip: {
				                        show: true
				                    },
				                    legend: {
				                        data:['销量']
				                    },
				                    xAxis : [
				                        {
				                            type : 'category',
				                            //data : ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
				                            data : x
				                        }
				                    ],
				                    yAxis : [
				                        {
				                            type : 'value'
				                        }
				                    ],
				                    series : [
				                        {
				                            "name":"销量",
				                            "type":"bar",
				                            //"data":[5, 20, 40, 10, 10, 20]
				                            "data":y
				                        }
				                    ]
				                };
				        
				                // 为echarts对象加载数据 
				                myChart.setOption(option); 
				            }
				        );
					}}
				);
	    }
    </script>
</body>
</html>