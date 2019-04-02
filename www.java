package demo;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset;



public class TestBarChart {
	 ChartPanel frame1;
	 public  TestBarChart(){ 
		 CategoryDataset dataset = getDataSet();
		 JFreeChart chart = ChartFactory.createBarChart3D( 
				 "ͳ��", // ͼ�����
				 "�ʻ�", // Ŀ¼�����ʾ��ǩ 
				 "���ִ���", // ��ֵ�����ʾ��ǩ
				 dataset, // ���ݼ� 
				 PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
				 true, // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false) 
				 false, // �Ƿ����ɹ���
				 false // �Ƿ�����URL����
				 );
				
				 
		 CategoryPlot plot=chart.getCategoryPlot();
		 //��ȡͼ��������� 
		  CategoryAxis domainAxis=plot.getDomainAxis();
		 //ˮƽ�ײ��б�
		 domainAxis.setLabelFont(new Font("����",Font.BOLD,14));
		 //ˮƽ�ײ�����
		 domainAxis.setTickLabelFont(new Font("����",Font.BOLD,12)); 
		 //��ֱ����
		 ValueAxis rangeAxis=plot.getRangeAxis();
		 //��ȡ��״
		 rangeAxis.setLabelFont(new Font("����",Font.BOLD,15)); 
		 chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
		 chart.getTitle().setFont(new Font("����",Font.BOLD,20));
		 //���ñ������� 
		 //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
		 frame1=new ChartPanel(chart,true); 
//����Ҳ������chartFrame,����ֱ������һ��������Frame 
} 
	 private static CategoryDataset getDataSet() {
		 //��txt�е����ݾ���������䵽Dataset
		 DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
		 dataset.addValue(10, "and", "and");
		 dataset.addValue(200, "the", "the"); 
		 dataset.addValue(300, "data", "data"); 
		 dataset.addValue(400, "h", "h"); 
		 dataset.addValue(500, "v", "v"); 
		
		
		 return dataset; 
		 } 
	 public ChartPanel getChartPanel(){
			 return frame1; } 
		
 public static void main(String[] args) {
	  System.out.println(1);
	  JFrame frame=new JFrame("Java����ͳ��ͼ");
		frame.setLayout(new GridLayout(2,2,10,10));
		frame.add(new TestBarChart().getChartPanel()); //�������ͼ 
		frame.setBounds(50, 50, 800, 600);
		frame.setVisible(true);
}
	 
			
}