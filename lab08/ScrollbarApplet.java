package lab08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarApplet extends Applet implements AdjustmentListener{

	Scrollbar sbar;
	TextField t1=new TextField(5);// commentB TextField class аас 5-н багана бүхий t1 объектийг үүсгэнэ.
	                              //TextField объект нь нэг мөр текстийг засварлах боломжийг олгодог текстийн component юм.
	public void init() {
		setLayout(new BorderLayout());// commentC  this container ийн байршлыг тохируулна.
		                                   //components хооронд зайгүй шинэ border layout үүсгэх.
		sbar= new Scrollbar(Scrollbar.HORIZONTAL, 1, 60, 0, 300);// commentD Scrollbar төрлийн sbar объектийг үүсгээд Horizontal 
		                                //чиглэлд,анхны утга, харагдахуйц хэмжээ, хамгийн бага ба хамгийн их утгатай Scrollbar үүсгэнэ.
		add(sbar, BorderLayout.CENTER);
		add(t1,BorderLayout.SOUTH);
		t1.setText(Integer.toString(sbar.getValue()));// commentE t1 объект-д sbar-ийн одоогийн утгыг аваад int ээс 
		                                              //String төрөлрүү хөрвүүлж байна. 
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		t1.setText(Integer.toString(sbar.getValue()));// commentG Хэрэглэгч scrolling component-ийн утгыг өөрчлөх үед
		                                        //AdjustmentEvent-ийн хүлээн авдаг. Тэр үед өөрчлөгдсөн t1 объектийн утгыг өөрчлөнө.
		
	}

}