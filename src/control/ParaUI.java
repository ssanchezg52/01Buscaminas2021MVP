package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Densidad;
import modelo.Dificultad;
import vista.UI;

public class ParaUI extends UI {

	public ParaUI() {
		super();
		// leyes de demeter
		// para solucionar esto es crear metodos delegados
//		jPanelOpciones.btnIniciar.addActionListener(l);
		getBtnIniciar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println((Densidad) getCmbDensidad().getSelectedItem());
				Dificultad selectedItem = (Dificultad) getCmbDificultad().getSelectedItem();
				System.out.println(selectedItem.getLongitud());
				
			}
		});		
	}

}
