package gmap;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
  
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Circle;
  
@ManagedBean
public class CirclesView implements Serializable {
    Double lat1 = -23.19784895680561,lat2 = -46.83287035000001,long1 = -23.19784895680561, long2 = -46.83287035000001; 

    private MapModel circleModel;
      
    @PostConstruct
    public void init() {
        
        circleModel = new DefaultMapModel();
        lat1+=0.1;
        lat2+=0.1;
        long1+=0.1;
        long2+=0.1;
        
        LatLng coord1 = new LatLng(lat1, long1);
        LatLng coord4 = new LatLng(lat2, long2);
  
        //Shared coordinates
       // LatLng coord1 = new LatLng(-23.19784895680561, -46.83287035000001);
      //  LatLng coord4 = new LatLng(36.885233, 30.702323);
       // -23.19784895680561, -46.83287035000001
       // while (true) {  
             //Circle
        Circle circle1 = new Circle(coord1, 500);
        circle1.setStrokeColor("#d93c3c");
        circle1.setFillColor("#d93c3c");
        circle1.setFillOpacity(0.5);
 
        Circle circle2 = new Circle(coord4, 300);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
 
        circleModel.addOverlay(circle1);
        circleModel.addOverlay(circle2);
            
       // }
        
 
       
    }
  
    public MapModel getCircleModel() {
        return circleModel;
    }
  
    public void onCircleSelect(OverlaySelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
    }
}
