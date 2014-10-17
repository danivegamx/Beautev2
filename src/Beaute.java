/* ------------------------------------------------ */
/* Sistema Integral de Calificación para Certamenes
/* Beauté Build 1.2
/* Desarrollado con Eclipse IDE + Linux JRE 1.7 SE
 * ------------------------------------------------ */

/* Librerías */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

/* Clase Inicio ---------------------------------------------------------------------------------------------------------------- */

class Inicio extends JWindow
{
	private static final long serialVersionUID = 1L;
	JLabel titulo,desc,copyright1,copyright2,copyright3,bydv,loading,img,ver,logo;
	JProgressBar barra;
	URL fond,ico;
	
	public Inicio()
	{
		this.setLayout(null);
		this.setSize(400, 300);
		this.setBounds(500,250,400,300);
		
		fond = getClass().getResource("/Beaute2_Resources/fondoinicio.jpg");
		ico = getClass().getResource("/Beaute2_Resources/logo.png");
		img = new JLabel();
			img.setIcon(new ImageIcon(fond));
			img.setBounds(0,-50,500,500);
			img.setOpaque(true);
		titulo = new JLabel("Beauté");
			titulo.setForeground(Color.white);
			titulo.setFont(new Font("Forte",Font.PLAIN,38));
			titulo.setBounds(45, 75, 200, 50);
		desc = new JLabel("Sistema Integral de Calificación para Certamenes");
			desc.setForeground(Color.white);
			desc.setFont(new Font("Calibri",Font.BOLD,14));
			desc.setBounds(60, 230, 300, 50);
		barra = new JProgressBar(0,100);
			barra.setBounds(50, 150, 300, 20);
		copyright1 = new JLabel("© Copyright Beauté ITJ 2012. Todos los derechos reservados. Beauté ver.1.0 es un");
			copyright1.setForeground(new Color(238,238,238));
			copyright1.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright1.setBounds(8, 260, 400, 20);
		copyright2 = new JLabel("programa 'Open Source' de DaniVega Software, desarrollado para el certamen");
			copyright2.setForeground(new Color(238,238,238));
			copyright2.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright2.setBounds(17, 270, 400, 20);
		copyright3 = new JLabel("Señorita Tecnológico 2012 Instituto Tecnológico de Jiquilpan.");
			copyright3.setForeground(new Color(238,238,238));
			copyright3.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright3.setBounds(52, 280, 300, 20);
		bydv = new JLabel("by DaniVega");
			bydv.setForeground(new Color(238,238,238));
			bydv.setFont(new Font("Freestyle Script",Font.PLAIN,24));
			bydv.setBounds(130, 100, 300, 50);
		loading = new JLabel();
			loading.setForeground(Color.white);
			loading.setFont(new Font("Calibri",Font.PLAIN,12));
			loading.setBounds(50, 155, 300, 50);
		ver = new JLabel("2.0 Srita. Tecnológico 2013");
			ver.setForeground(new Color(238,238,238));
			ver.setFont(new Font("Calibri",Font.PLAIN,10));
			ver.setBounds(158, 84, 300, 50);
		logo = new JLabel();
			logo.setIcon(new ImageIcon(ico));
			logo.setBounds(45, 0, 100, 100);
		
		add(logo);add(ver);add(loading);add(bydv);add(copyright3);add(copyright2);add(copyright1);add(titulo);add(desc);add(barra);add(img);
			
		this.setVisible(true);
		Barra();
	}
	
	public void Barra() 
	{
		for (int i = 0; i < 100; i++) 
		{
			if(i==0)
			{
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				loading.setText("Cargando recursos...");
			}
			if(i==50)
			{
				loading.setText("Cargando interfaz gráfica...");
			}
			if(i==75)
			{
				try {Thread.sleep(2000);} catch (InterruptedException e) {}
				loading.setText("Iniciando...");
			}
			barra.setValue(i);
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
		this.setVisible(false);
	}
}

/* Clase lanzadora */

public class Beaute implements ActionListener
{
	/* Definición de componentes y variables */
	JFrame ventana;
	JToolBar barra;
	JMenuBar menu;
	JMenu ayuda;
	JMenuItem info,contacto,acerca;
	Container cont;
	JTabbedPane tabs;
	JLabel legend1,fondopaneles1,fondopaneles2,fondopaneles3,fondopaneles4,fondopaneles5,fondopaneles6,fondopaneles7,fondopaneles8,ljovana,lalejandra,lmaryluz,lkarla,ltere,lmafer,lale,lsusy;
	URL imp,sal,cinfor,ayu,infor,contact,acer,rbety,rgaby,ritzy,rlau,rpao,rpipis,al,su,fondpan;
	/* Elementos de las candidatas */
		/* Bety */
		TextField coalha1,dees1,dodeles1,se1,be1,cr1;
		JLabel lcoalha1,ldees1,ldodeles1,lse1,lbe1,lcr1,punt1;
		JButton calificar1, inf1;
		int puntbety;boolean opbety = false;
		/* Gabriela */
		TextField coalha2,dees2,dodeles2,se2,be2,cr2;
		JLabel lcoalha2,ldees2,ldodeles2,lse2,lbe2,lcr2,punt2;
		JButton calificar2, inf2;
		int puntgaby;boolean opgaby =  false;
		/* Maryluz */
		TextField coalha3,dees3,dodeles3,se3,be3,cr3;
		JLabel lcoalha3,ldees3,ldodeles3,lse3,lbe3,lcr3,punt3;
		JButton calificar3, inf3;
		int puntitzy; boolean opitzy = false;
		/* Karla */
		TextField coalha4,dees4,dodeles4,se4,be4,cr4;
		JLabel lcoalha4,ldees4,ldodeles4,lse4,lbe4,lcr4,punt4;
		JButton calificar4, inf4;
		int puntlau; boolean opkarla = false;
		/* Tere */
		TextField coalha5,dees5,dodeles5,se5,be5,cr5;
		JLabel lcoalha5,ldees5,ldodeles5,lse5,lbe5,lcr5,punt5;
		JButton calificar5, inf5;
		int punttere; boolean optere = false;
		/* Mafer */
		TextField coalha6,dees6,dodeles6,se6,be6,cr6;
		JLabel lcoalha6,ldees6,ldodeles6,lse6,lbe6,lcr6,punt6;
		JButton calificar6, inf6;
		int puntmafer; boolean opmafer = false;
		/* Alejandra */
		TextField coalha7,dees7,dodeles7,se7,be7,cr7;
		JLabel lcoalha7,ldees7,ldodeles7,lse7,lbe7,lcr7,punt7;
		JButton calificar7, inf7;
		int puntale; boolean opale = false;
		/* Susy */
		TextField coalha8,dees8,dodeles8,se8,be8,cr8;
		JLabel lcoalha8,ldees8,ldodeles8,lse8,lbe8,lcr8,punt8;
		JButton calificar8,inf8;
		int puntsusy; boolean opsusy = false;
	
	public Beaute(String titulo) 
	{
		ventana = new JFrame(titulo);
		ventana.setBounds(300, 50, 900, 600);
		
		// Se definen las propiedades visuales (Tamaño, color, fuente, etc.)
		ventana.setSize(900, 600);
		ventana.setResizable(false);
		
		// Se construyen los elementos de nuestro applet.
		fondpan = getClass().getResource("/Beaute_Resources/fon.png");
		ayu = getClass().getResource("/Beaute_Resources/ayuda.png");
		fondopaneles1 = new JLabel();
			fondopaneles1.setIcon(new ImageIcon(fondpan));
		fondopaneles2 = new JLabel();
			fondopaneles2.setIcon(new ImageIcon(fondpan));
		fondopaneles3 = new JLabel();
			fondopaneles3.setIcon(new ImageIcon(fondpan));
		fondopaneles4 = new JLabel();
			fondopaneles4.setIcon(new ImageIcon(fondpan));
		fondopaneles5 = new JLabel();
			fondopaneles5.setIcon(new ImageIcon(fondpan));
		fondopaneles6 = new JLabel();
			fondopaneles6.setIcon(new ImageIcon(fondpan));
		fondopaneles7 = new JLabel();
			fondopaneles7.setIcon(new ImageIcon(fondpan));
		fondopaneles8 = new JLabel();
			fondopaneles8.setIcon(new ImageIcon(fondpan));
		legend1 = new JLabel("Sistema de calificación - navegación por pestañas.");
			legend1.setForeground(Color.white);
		menu = new JMenuBar();
		ventana.setJMenuBar(menu); // <---- Asigna el menú a la ventana.
		ayuda = new JMenu();
			ayuda.setIcon(new ImageIcon(ayu));
		/* Paneles */
		JPanel superior = new JPanel();
			superior.setLayout(new GridLayout(2,1));
			superior.setBackground(new Color(10,43,75));
			JPanel titsuperior = new JPanel();
				titsuperior.setBackground(new Color(10,43,75));
			JPanel voidsuperior = new JPanel();
				voidsuperior.setBackground(new Color(10,43,75));
		JPanel izquierda = new JPanel();
			izquierda.setBackground(new Color(10,43,75));
		JPanel derecha = new JPanel();
			derecha.setBackground(new Color(10,43,75));
		JPanel inferior = new JPanel();
			inferior.setBackground(new Color(10,43,75));
		JPanel pjovana = new JPanel();
			pjovana.setLayout(null);
		JPanel palejandra = new JPanel();
			palejandra.setLayout(null);
		JPanel pmaryluz = new JPanel();
			pmaryluz.setLayout(null);
		JPanel pkarla = new JPanel();
			pkarla.setLayout(null);
		JPanel ptere = new JPanel();
			ptere.setLayout(null);
		JPanel pmafer = new JPanel();
			pmafer.setLayout(null);
		JPanel pale = new JPanel();
			pale.setLayout(null);
		JPanel psusy = new JPanel();
			psusy.setLayout(null);
		tabs = new JTabbedPane();

		infor = getClass().getResource("/Beaute_Resources/info.png");
		info = new JMenuItem("Conozca la aplicación...");
			info.setMnemonic('a');
			info.setToolTipText("Información de la aplicación");
			info.setIcon(new ImageIcon(infor));
		contact = getClass().getResource("/Beaute_Resources/contacto.png");
		contacto = new JMenuItem("Contáctenos");
			contacto.setMnemonic('C');
			contacto.setToolTipText("¿Dudas? ¿Sugerencias? ¡Contáctenos!");
			contacto.setIcon(new ImageIcon(contact));
		acer = getClass().getResource("/Beaute_Resources/acerca.png");
		acerca = new JMenuItem("Acerca de Beauté...");
			acerca.setMnemonic('B');
			acerca.setToolTipText("Acerca de la aplicación");
			acerca.setIcon(new ImageIcon(acer));
		
		// Se define el tipo de Gestor de Organización (BorderLayout) y los páneles.
		ventana.setLayout(new BorderLayout());
				
		// Se agregan los elementos al contenedor.
		cont = ventana.getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(new Color(10,43,75));
		/* Pestañas */
		tabs.addTab( "Jovana", null, pjovana, "Primer panel" );
		tabs.addTab( "Alejandra", null, palejandra, "Segundo panel" );
		tabs.addTab( "Maryluz", null, pmaryluz, "Tercer panel" );
		tabs.addTab( "Karla", null, pkarla, "Cuarto panel" );
		tabs.addTab( "Tere", null, ptere, "Quinto panel" );
		tabs.addTab( "Mafer", null, pmafer, "Secto panel" );
		tabs.addTab( "Alejandra", null, pale, "Séptimo panel" );
		tabs.addTab( "Susy", null, psusy, "Octavo panel" );
		ventana.add(tabs,BorderLayout.CENTER);
		/* Páneles */
		titsuperior.add(legend1);
		superior.add(titsuperior);superior.add(voidsuperior);
		ventana.add(superior,BorderLayout.NORTH); // Etiqueta
		ventana.add(izquierda,BorderLayout.WEST);
		ventana.add(derecha,BorderLayout.EAST);
		ventana.add(inferior,BorderLayout.SOUTH);
		fondopaneles1.setBounds(0,-70,900,600);
		fondopaneles2.setBounds(0,-70,900,600);
		fondopaneles3.setBounds(0,-70,900,600);
		fondopaneles4.setBounds(0,-70,900,600);
		fondopaneles5.setBounds(0,-70,900,600);
		fondopaneles6.setBounds(0,-70,900,600);
		fondopaneles7.setBounds(0,-70,900,600);
		fondopaneles8.setBounds(0,-70,900,600);
		
		/* JOVANA ........................................................................................................................................................ */
		rbety = getClass().getResource("/Beaute_Resources/jovana.jpg");
		URL cal = getClass().getResource("/Beaute_Resources/do.png");
		URL inf = getClass().getResource("/Beaute_Resources/inf.png");
		ljovana = new JLabel();
			ljovana.setIcon(new ImageIcon(rbety));
			ljovana.setBounds(10, 10, 336, 440);
		lcoalha1 = new JLabel("Coherencia al hablar:");
			lcoalha1.setForeground(Color.white);
			lcoalha1.setBounds(400, 50, 200, 30);
		coalha1 = new TextField("",3);
			coalha1.setBounds(580, 55, 50, 20);
		ldees1 = new JLabel("Desenvolvimiento escénico:");
			ldees1.setForeground(Color.white);
			ldees1.setBounds(400, 100, 200, 30);
		dees1 = new TextField("",3);
			dees1.setBounds(580, 105, 50, 20);
		ldodeles1 = new JLabel("Dominio del escenario:");
			ldodeles1.setForeground(Color.white);
			ldodeles1.setBounds(400, 150, 200, 30);
		dodeles1 = new TextField("",3);
			dodeles1.setBounds(580, 155, 50, 20);
		lse1 = new JLabel("Seguridad:");
			lse1.setForeground(Color.white);
			lse1.setBounds(400, 200, 200, 30);
		se1 = new TextField("",3);
			se1.setBounds(580, 205, 50, 20);
		lbe1 = new JLabel("Belleza:");
			lbe1.setForeground(Color.white);
			lbe1.setBounds(400, 250, 200, 30);
		be1 = new TextField("",3);
			be1.setBounds(580, 255, 50, 20);
		lcr1 = new JLabel("Creatividad:");
			lcr1.setForeground(Color.white);
			lcr1.setBounds(400, 300, 200, 30);
		cr1 = new TextField("",3);
			cr1.setBounds(580, 305, 50, 20);
		calificar1 = new JButton();
			calificar1.setIcon(new ImageIcon(cal));
			calificar1.setBounds(700, 380, 100, 40);
		inf1 = new JButton();
			inf1.setIcon(new ImageIcon(inf));
			inf1.setToolTipText("Información de Jovana");
			inf1.setBounds(700, 330, 100, 40);
		punt1 = new JLabel("Puntaje:");
			punt1.setForeground(Color.white);
			punt1.setFont(new Font("Calibri",Font.BOLD,20));
			punt1.setBounds(400, 380, 200, 40);
		pjovana.add(punt1);
		pjovana.add(inf1);
		pjovana.add(calificar1);
		pjovana.add(cr1);
		pjovana.add(lcr1);
		pjovana.add(be1);
		pjovana.add(lbe1);
		pjovana.add(se1);
		pjovana.add(lse1);
		pjovana.add(dodeles1);
		pjovana.add(ldodeles1);
		pjovana.add(dees1);
		pjovana.add(ldees1);
		pjovana.add(coalha1);
		pjovana.add(lcoalha1);
		pjovana.add(ljovana);
		pjovana.add(fondopaneles1);
		
		/* ALEJANDRA ...................................................................................................................................................... */
		rgaby = getClass().getResource("/Beaute_Resources/alejandra.jpg");
		lalejandra = new JLabel();
			lalejandra.setIcon(new ImageIcon(rgaby));
			lalejandra.setBounds(10, 10, 336, 440);
		lcoalha2 = new JLabel("Coherencia al hablar:");
			lcoalha2.setForeground(Color.white);
			lcoalha2.setBounds(400, 50, 200, 30);
		coalha2 = new TextField("",3);
			coalha2.setBounds(580, 55, 50, 20);
		ldees2 = new JLabel("Desenvolvimiento escénico:");
			ldees2.setForeground(Color.white);
			ldees2.setBounds(400, 100, 200, 30);
		dees2 = new TextField("",3);
			dees2.setBounds(580, 105, 50, 20);
		ldodeles2 = new JLabel("Dominio del escenario:");
			ldodeles2.setForeground(Color.white);
			ldodeles2.setBounds(400, 150, 200, 30);
		dodeles2 = new TextField("",3);
			dodeles2.setBounds(580, 155, 50, 20);
		lse2 = new JLabel("Seguridad:");
			lse2.setForeground(Color.white);
			lse2.setBounds(400, 200, 200, 30);
		se2 = new TextField("",3);
			se2.setBounds(580, 205, 50, 20);
		lbe2 = new JLabel("Belleza:");
			lbe2.setForeground(Color.white);
			lbe2.setBounds(400, 250, 200, 30);
		be2 = new TextField("",3);
			be2.setBounds(580, 255, 50, 20);
		lcr2 = new JLabel("Creatividad:");
			lcr2.setForeground(Color.white);
			lcr2.setBounds(400, 300, 200, 30);
		cr2 = new TextField("",3);
			cr2.setBounds(580, 305, 50, 20);
		calificar2 = new JButton();
			calificar2.setIcon(new ImageIcon(cal));
			calificar2.setBounds(700, 380, 100, 40);
		inf2 = new JButton();
			inf2.setIcon(new ImageIcon(inf));
			inf2.setToolTipText("Información de Alejandra");
			inf2.setBounds(700, 330, 100, 40);
		punt2 = new JLabel("Puntaje:");
			punt2.setForeground(Color.white);
			punt2.setFont(new Font("Calibri",Font.BOLD,20));
			punt2.setBounds(400, 380, 200, 40);
		palejandra.add(punt2);
		palejandra.add(calificar2);
		palejandra.add(inf2);
		palejandra.add(cr2);
		palejandra.add(lcr2);
		palejandra.add(be2);
		palejandra.add(lbe2);
		palejandra.add(se2);
		palejandra.add(lse2);
		palejandra.add(dodeles2);
		palejandra.add(ldodeles2);
		palejandra.add(dees2);
		palejandra.add(ldees2);
		palejandra.add(coalha2);
		palejandra.add(lcoalha2);
		palejandra.add(lalejandra);
		palejandra.add(fondopaneles2);
		
		/* MARYLUZ ...................................................................................................................................................... */
		rpao = getClass().getResource("/Beaute_Resources/maryluz.jpg");
		lmaryluz = new JLabel();
			lmaryluz.setIcon(new ImageIcon(rpao));
			lmaryluz.setBounds(10, 10, 336, 440);
		lcoalha3 = new JLabel("Coherencia al hablar:");
			lcoalha3.setForeground(Color.white);
			lcoalha3.setBounds(400, 50, 200, 30);
		coalha3 = new TextField("",3);
			coalha3.setBounds(580, 55, 50, 20);
		ldees3 = new JLabel("Desenvolvimiento escénico:");
			ldees3.setForeground(Color.white);
			ldees3.setBounds(400, 100, 200, 30);
		dees3 = new TextField("",3);
			dees3.setBounds(580, 105, 50, 20);
		ldodeles3 = new JLabel("Dominio del escenario:");
			ldodeles3.setForeground(Color.white);
			ldodeles3.setBounds(400, 150, 200, 30);
		dodeles3 = new TextField("",3);
			dodeles3.setBounds(580, 155, 50, 20);
		lse3 = new JLabel("Seguridad:");
			lse3.setForeground(Color.white);
			lse3.setBounds(400, 200, 200, 30);
		se3 = new TextField("",3);
			se3.setBounds(580, 205, 50, 20);
		lbe3 = new JLabel("Belleza:");
			lbe3.setForeground(Color.white);
			lbe3.setBounds(400, 250, 200, 30);
		be3 = new TextField("",3);
			be3.setBounds(580, 255, 50, 20);
		lcr3 = new JLabel("Creatividad:");
			lcr3.setForeground(Color.white);
			lcr3.setBounds(400, 300, 200, 30);
		cr3 = new TextField("",3);
			cr3.setBounds(580, 305, 50, 20);
		calificar3 = new JButton();
			calificar3.setIcon(new ImageIcon(cal));
			calificar3.setBounds(700, 380, 100, 40);
		inf3 = new JButton();
			inf3.setIcon(new ImageIcon(inf));
			inf3.setToolTipText("Información de Maryluz");
			inf3.setBounds(700, 330, 100, 40);
		punt3 = new JLabel("Puntaje:");
			punt3.setForeground(Color.white);
			punt3.setFont(new Font("Calibri",Font.BOLD,20));
			punt3.setBounds(400, 380, 200, 40);
		pmaryluz.add(punt3);
		pmaryluz.add(inf3);
		pmaryluz.add(calificar3);
		pmaryluz.add(cr3);
		pmaryluz.add(lcr3);
		pmaryluz.add(be3);
		pmaryluz.add(lbe3);
		pmaryluz.add(se3);
		pmaryluz.add(lse3);
		pmaryluz.add(dodeles3);
		pmaryluz.add(ldodeles3);
		pmaryluz.add(dees3);
		pmaryluz.add(ldees3);
		pmaryluz.add(coalha3);
		pmaryluz.add(lcoalha3);
		pmaryluz.add(lmaryluz);
		pmaryluz.add(fondopaneles3);
		
		/* KARLA ...................................................................................................................................................... */
		rpipis = getClass().getResource("/Beaute_Resources/karla.jpg");
		lkarla = new JLabel();
			lkarla.setIcon(new ImageIcon(rpipis));
			lkarla.setBounds(10, 10, 336, 440);
		lcoalha4 = new JLabel("Coherencia al hablar:");
			lcoalha4.setForeground(Color.white);
			lcoalha4.setBounds(400, 50, 200, 30);
		coalha4 = new TextField("",3);
			coalha4.setBounds(580, 55, 50, 20);
		ldees4 = new JLabel("Desenvolvimiento escénico:");
			ldees4.setForeground(Color.white);
			ldees4.setBounds(400, 100, 200, 30);
		dees4 = new TextField("",3);
			dees4.setBounds(580, 105, 50, 20);
		ldodeles4 = new JLabel("Dominio del escenario:");
			ldodeles4.setForeground(Color.white);
			ldodeles4.setBounds(400, 150, 200, 30);
		dodeles4 = new TextField("",3);
			dodeles4.setBounds(580, 155, 50, 20);
		lse4 = new JLabel("Seguridad:");
			lse4.setForeground(Color.white);
			lse4.setBounds(400, 200, 200, 30);
		se4 = new TextField("",3);
			se4.setBounds(580, 205, 50, 20);
		lbe4 = new JLabel("Belleza:");
			lbe4.setForeground(Color.white);
			lbe4.setBounds(400, 250, 200, 30);
		be4 = new TextField("",3);
			be4.setBounds(580, 255, 50, 20);
		lcr4 = new JLabel("Creatividad:");
			lcr4.setForeground(Color.white);
			lcr4.setBounds(400, 300, 200, 30);
		cr4 = new TextField("",3);
			cr4.setBounds(580, 305, 50, 20);
		calificar4 = new JButton();
			calificar4.setIcon(new ImageIcon(cal));
			calificar4.setBounds(700, 380, 100, 40);
		inf4 = new JButton();
			inf4.setIcon(new ImageIcon(inf));
			inf4.setToolTipText("Información de Karla");
			inf4.setBounds(700, 330, 100, 40);
		punt4 = new JLabel("Puntaje:");
			punt4.setForeground(Color.white);
			punt4.setFont(new Font("Calibri",Font.BOLD,20));
			punt4.setBounds(400, 380, 200, 40);
		pkarla.add(punt4);
		pkarla.add(inf4);
		pkarla.add(calificar4);
		pkarla.add(cr4);
		pkarla.add(lcr4);
		pkarla.add(be4);
		pkarla.add(lbe4);
		pkarla.add(se4);
		pkarla.add(lse4);
		pkarla.add(dodeles4);
		pkarla.add(ldodeles4);
		pkarla.add(dees4);
		pkarla.add(ldees4);
		pkarla.add(coalha4);
		pkarla.add(lcoalha4);
		pkarla.add(lkarla);
		pkarla.add(fondopaneles4);
		
		/* TERE ...................................................................................................................................................... */
		ritzy = getClass().getResource("/Beaute_Resources/tere.jpg");
		ltere = new JLabel();
			ltere.setIcon(new ImageIcon(ritzy));
			ltere.setBounds(10, 10, 336, 440);
		lcoalha5 = new JLabel("Coherencia al hablar:");
			lcoalha5.setForeground(Color.white);
			lcoalha5.setBounds(400, 50, 200, 30);
		coalha5 = new TextField("",3);
			coalha5.setBounds(580, 55, 50, 20);
		ldees5 = new JLabel("Desenvolvimiento escénico:");
			ldees5.setForeground(Color.white);
			ldees5.setBounds(400, 100, 200, 30);
		dees5 = new TextField("",3);
			dees5.setBounds(580, 105, 50, 20);
		ldodeles5 = new JLabel("Dominio del escenario:");
			ldodeles5.setForeground(Color.white);
			ldodeles5.setBounds(400, 150, 200, 30);
		dodeles5 = new TextField("",3);
			dodeles5.setBounds(580, 155, 50, 20);
		lse5 = new JLabel("Seguridad:");
			lse5.setForeground(Color.white);
			lse5.setBounds(400, 200, 200, 30);
		se5 = new TextField("",3);
			se5.setBounds(580, 205, 50, 20);
		lbe5 = new JLabel("Belleza:");
			lbe5.setForeground(Color.white);
			lbe5.setBounds(400, 250, 200, 30);
		be5 = new TextField("",3);
			be5.setBounds(580, 255, 50, 20);
		lcr5 = new JLabel("Creatividad:");
			lcr5.setForeground(Color.white);
			lcr5.setBounds(400, 300, 200, 30);
		cr5 = new TextField("",3);
			cr5.setBounds(580, 305, 50, 20);
		calificar5 = new JButton();
			calificar5.setIcon(new ImageIcon(cal));
			calificar5.setBounds(700, 380, 100, 40);
		inf5 = new JButton();
			inf5.setIcon(new ImageIcon(inf));
			inf5.setToolTipText("Información de Tere");
			inf5.setBounds(700, 330, 100, 40);
		punt5 = new JLabel("Puntaje:");
			punt5.setForeground(Color.white);
			punt5.setFont(new Font("Calibri",Font.BOLD,20));
			punt5.setBounds(400, 380, 200, 40);
		ptere.add(punt5);
		ptere.add(inf5);
		ptere.add(calificar5);
		ptere.add(cr5);
		ptere.add(lcr5);
		ptere.add(be5);
		ptere.add(lbe5);
		ptere.add(se5);
		ptere.add(lse5);
		ptere.add(dodeles5);
		ptere.add(ldodeles5);
		ptere.add(dees5);
		ptere.add(ldees5);
		ptere.add(coalha5);
		ptere.add(lcoalha5);
		ptere.add(ltere);
		ptere.add(fondopaneles5);
		
		/* MAFER ...................................................................................................................................................... */
		rlau = getClass().getResource("/Beaute_Resources/mafer.jpg");
		lmafer = new JLabel();
			lmafer.setIcon(new ImageIcon(rlau));
			lmafer.setBounds(10, 10, 336, 440);
		lcoalha6 = new JLabel("Coherencia al hablar:");
			lcoalha6.setForeground(Color.white);
			lcoalha6.setBounds(400, 50, 200, 30);
		coalha6 = new TextField("",3);
			coalha6.setBounds(580, 55, 50, 20);
		ldees6 = new JLabel("Desenvolvimiento escénico:");
			ldees6.setForeground(Color.white);
			ldees6.setBounds(400, 100, 200, 30);
		dees6 = new TextField("",3);
			dees6.setBounds(580, 105, 50, 20);
		ldodeles6 = new JLabel("Dominio del escenario:");
			ldodeles6.setForeground(Color.white);
			ldodeles6.setBounds(400, 150, 200, 30);
		dodeles6 = new TextField("",3);
			dodeles6.setBounds(580, 155, 50, 20);
		lse6 = new JLabel("Seguridad:");
			lse6.setForeground(Color.white);
			lse6.setBounds(400, 200, 200, 30);
		se6 = new TextField("",3);
			se6.setBounds(580, 205, 50, 20);
		lbe6 = new JLabel("Belleza:");
			lbe6.setForeground(Color.white);
			lbe6.setBounds(400, 250, 200, 30);
		be6 = new TextField("",3);
			be6.setBounds(580, 255, 50, 20);
		lcr6 = new JLabel("Creatividad:");
			lcr6.setForeground(Color.white);
			lcr6.setBounds(400, 300, 200, 30);
		cr6 = new TextField("",3);
			cr6.setBounds(580, 305, 50, 20);
		calificar6 = new JButton();
			calificar6.setIcon(new ImageIcon(cal));
			calificar6.setBounds(700, 380, 100, 40);
		inf6 = new JButton();
			inf6.setIcon(new ImageIcon(inf));
			inf6.setToolTipText("Información de Mafer");
			inf6.setBounds(700, 330, 100, 40);
		punt6 = new JLabel("Puntaje:");
			punt6.setForeground(Color.white);
			punt6.setFont(new Font("Calibri",Font.BOLD,20));
			punt6.setBounds(400, 380, 200, 40);
		pmafer.add(punt6);
		pmafer.add(inf6);
		pmafer.add(calificar6);
		pmafer.add(cr6);
		pmafer.add(lcr6);
		pmafer.add(be6);
		pmafer.add(lbe6);
		pmafer.add(se6);
		pmafer.add(lse6);
		pmafer.add(dodeles6);
		pmafer.add(ldodeles6);
		pmafer.add(dees6);
		pmafer.add(ldees6);
		pmafer.add(coalha6);
		pmafer.add(lcoalha6);
		pmafer.add(lmafer);
		pmafer.add(fondopaneles6);
		
		/* ALE ...................................................................................................................................................... */
		al = getClass().getResource("/Beaute_Resources/ale.jpg");
		lale = new JLabel();
			lale.setIcon(new ImageIcon(al));
			lale.setBounds(10, 10, 336, 440);
		lcoalha7 = new JLabel("Coherencia al hablar:");
			lcoalha7.setForeground(Color.white);
			lcoalha7.setBounds(400, 50, 200, 30);
		coalha7 = new TextField("",3);
			coalha7.setBounds(580, 55, 50, 20);
		ldees7 = new JLabel("Desenvolvimiento escénico:");
			ldees7.setForeground(Color.white);
			ldees7.setBounds(400, 100, 200, 30);
		dees7 = new TextField("",3);
			dees7.setBounds(580, 105, 50, 20);
		ldodeles7 = new JLabel("Dominio del escenario:");
			ldodeles7.setForeground(Color.white);
			ldodeles7.setBounds(400, 150, 200, 30);
		dodeles7 = new TextField("",3);
			dodeles7.setBounds(580, 155, 50, 20);
		lse7 = new JLabel("Seguridad:");
			lse7.setForeground(Color.white);
			lse7.setBounds(400, 200, 200, 30);
		se7 = new TextField("",3);
			se7.setBounds(580, 205, 50, 20);
		lbe7 = new JLabel("Belleza:");
			lbe7.setForeground(Color.white);
			lbe7.setBounds(400, 250, 200, 30);
		be7 = new TextField("",3);
			be7.setBounds(580, 255, 50, 20);
		lcr7 = new JLabel("Creatividad:");
			lcr7.setForeground(Color.white);
			lcr7.setBounds(400, 300, 200, 30);
		cr7 = new TextField("",3);
			cr7.setBounds(580, 305, 50, 20);
		calificar7 = new JButton();
			calificar7.setIcon(new ImageIcon(cal));
			calificar7.setBounds(700, 380, 100, 40);
		inf7 = new JButton();
			inf7.setIcon(new ImageIcon(inf));
			inf7.setToolTipText("Información de Alejandra");
			inf7.setBounds(700, 330, 100, 40);
		punt7 = new JLabel("Puntaje:");
			punt7.setForeground(Color.white);
			punt7.setFont(new Font("Calibri",Font.BOLD,20));
			punt7.setBounds(400, 380, 200, 40);
		pale.add(punt7);
		pale.add(inf7);
		pale.add(calificar7);
		pale.add(cr7);
		pale.add(lcr7);
		pale.add(be7);
		pale.add(lbe7);
		pale.add(se7);
		pale.add(lse7);
		pale.add(dodeles7);
		pale.add(ldodeles7);
		pale.add(dees7);
		pale.add(ldees7);
		pale.add(coalha7);
		pale.add(lcoalha7);
		pale.add(lale);
		pale.add(fondopaneles7);
		
		/* SUSY ...................................................................................................................................................... */
		su = getClass().getResource("/Beaute_Resources/susy.jpg");
		lsusy = new JLabel();
			lsusy.setIcon(new ImageIcon(su));
			lsusy.setBounds(10, 10, 336, 440);
		lcoalha8 = new JLabel("Coherencia al hablar:");
			lcoalha8.setForeground(Color.white);
			lcoalha8.setBounds(400, 50, 200, 30);
		coalha8 = new TextField("",3);
			coalha8.setBounds(580, 55, 50, 20);
		ldees8 = new JLabel("Desenvolvimiento escénico:");
			ldees8.setForeground(Color.white);
			ldees8.setBounds(400, 100, 200, 30);
		dees8 = new TextField("",3);
			dees8.setBounds(580, 105, 50, 20);
		ldodeles8 = new JLabel("Dominio del escenario:");
			ldodeles8.setForeground(Color.white);
			ldodeles8.setBounds(400, 150, 200, 30);
		dodeles8 = new TextField("",3);
			dodeles8.setBounds(580, 155, 50, 20);
		lse8 = new JLabel("Seguridad:");
			lse8.setForeground(Color.white);
			lse8.setBounds(400, 200, 200, 30);
		se8 = new TextField("",3);
			se8.setBounds(580, 205, 50, 20);
		lbe8 = new JLabel("Belleza:");
			lbe8.setForeground(Color.white);
			lbe8.setBounds(400, 250, 200, 30);
		be8 = new TextField("",3);
			be8.setBounds(580, 255, 50, 20);
		lcr8 = new JLabel("Creatividad:");
			lcr8.setForeground(Color.white);
			lcr8.setBounds(400, 300, 200, 30);
		cr8 = new TextField("",3);
			cr8.setBounds(580, 305, 50, 20);
		calificar8 = new JButton();
			calificar8.setIcon(new ImageIcon(cal));
			calificar8.setBounds(700, 380, 100, 40);
		inf8 = new JButton();
			inf8.setIcon(new ImageIcon(inf));
			inf8.setToolTipText("Información de Susy");
			inf8.setBounds(700, 330, 100, 40);
		punt8 = new JLabel("Puntaje:");
			punt8.setForeground(Color.white);
			punt8.setFont(new Font("Calibri",Font.BOLD,20));
			punt8.setBounds(400, 380, 200, 40);
		psusy.add(punt8);
		psusy.add(inf8);
		psusy.add(calificar8);
		psusy.add(cr8);
		psusy.add(lcr8);
		psusy.add(be8);
		psusy.add(lbe8);
		psusy.add(se8);
		psusy.add(lse8);
		psusy.add(dodeles8);
		psusy.add(ldodeles8);
		psusy.add(dees8);
		psusy.add(ldees8);
		psusy.add(coalha8);
		psusy.add(lcoalha8);
		psusy.add(lsusy);
		psusy.add(fondopaneles8);
		
		/* Menús */
		ayuda.add(acerca);
		menu.add(ayuda);
		
		// Se agregan los eventos.
		info.addActionListener(this);
		contacto.addActionListener(this);
		acerca.addActionListener(this);
		calificar1.addActionListener(this);inf1.addActionListener(this);
		calificar2.addActionListener(this);inf2.addActionListener(this);
		calificar3.addActionListener(this);inf3.addActionListener(this);
		calificar4.addActionListener(this);inf4.addActionListener(this);
		calificar5.addActionListener(this);inf5.addActionListener(this);
		calificar6.addActionListener(this);inf6.addActionListener(this);
		calificar7.addActionListener(this);inf7.addActionListener(this);
		calificar8.addActionListener(this);inf8.addActionListener(this);
		
		// Se genera la ventana.
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new Inicio();
		new Beaute("Beauté Buld 1.2");
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == acerca)
		{
			new Acerca();
		}
		if(ae.getSource() == inf1)
		{
			new Informacion(ventana,true,"Jovana","1.82 m.","74 Kg.","","","Jiquilpan, Mich.","Administración","4° Semestre");
		}
		if(ae.getSource() == inf2)
		{
			new Informacion(ventana,true,"Alejandra","1.65 m.","58 Kg.","Escuchar música.","20 años","Sahuayo, Mich.","Ing. en Gestión Empresarial","4° Semestre");
		}
		if(ae.getSource() == inf3)
		{
			new Informacion(ventana,true,"Maryluz","1.61 m.","55 Kg.","Leer, jugar basquet, piano.","18 años","Jacona, Mich.","Contador Público","2° Semestre");
		}
		if(ae.getSource() == inf4)
		{
			new Informacion(ventana,true,"Karla","1.64 m.","62.5 Kg.","Bailar","21 años","Jacona, Mich.","Ing. Bioquímica","8° Semestre");
		}
		if(ae.getSource() == inf5)
		{
			new Informacion(ventana,true,"Tere","","","","","","","");
		}
		if(ae.getSource() == inf6)
		{
			new Informacion(ventana,true,"Mafer","1.80 m.","73 Kg.","Salir con amigas.","19 años","Jacona, Mich.","Administración","2° Semestre");
		}
		if(ae.getSource() == inf7)
		{
			new Informacion(ventana,true,"Alejandra","1.71 m.","53 Kg.","Deportes, salir con amigas.","18 años","Sahuayo, Mich.","Ing. en Gestión Empresarial","2° Semestre");
		}
		if(ae.getSource() == inf8)
		{
			new Informacion(ventana,true,"Susy","1.67 m.","52 Kg.","Jugar Volleyball, convivir con familia.","21 años","San José de Gracia, Mich.","Ing. Bioquímica","4° Semestre");
		}
		if(ae.getSource() == calificar1)
		{
			String coalha = coalha1.getText();
			String dees = dees1.getText();
			String dodeles = dodeles1.getText();
			String se = se1.getText();
			String be = be1.getText();
			String cr = cr1.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntbety = suma;
				opbety = true;
				
				punt1.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				{JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar2)
		{
			String coalha = coalha2.getText();
			String dees = dees2.getText();
			String dodeles = dodeles2.getText();
			String se = se2.getText();
			String be = be2.getText();
			String cr = cr2.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntgaby = suma;
				opgaby = true;

				punt2.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar3)
		{
			String coalha = coalha3.getText();
			String dees = dees3.getText();
			String dodeles = dodeles3.getText();
			String se = se3.getText();
			String be = be3.getText();
			String cr = cr3.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntitzy= suma;
				opitzy = true;

				punt3.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar4)
		{
			String coalha = coalha4.getText();
			String dees = dees4.getText();
			String dodeles = dodeles4.getText();
			String se = se4.getText();
			String be = be4.getText();
			String cr = cr4.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntlau = suma;
				opkarla = true;

				punt4.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar5)
		{
			String coalha = coalha5.getText();
			String dees = dees5.getText();
			String dodeles = dodeles5.getText();
			String se = se5.getText();
			String be = be5.getText();
			String cr = cr5.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				punttere = suma;
				optere = true;

				punt5.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar6)
		{
			String coalha = coalha6.getText();
			String dees = dees6.getText();
			String dodeles = dodeles6.getText();
			String se = se6.getText();
			String be = be6.getText();
			String cr = cr6.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntmafer = suma;
				opmafer = true;

				punt6.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar7)
		{
			String coalha = coalha7.getText();
			String dees = dees7.getText();
			String dodeles = dodeles7.getText();
			String se = se7.getText();
			String be = be7.getText();
			String cr = cr7.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntale = suma;
				opale = true;

				punt7.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
		if(ae.getSource() == calificar8)
		{
			String coalha = coalha8.getText();
			String dees = dees8.getText();
			String dodeles = dodeles8.getText();
			String se = se8.getText();
			String be = be8.getText();
			String cr = cr8.getText();
			
			if(!coalha.equals("") && !dees.equals("") && !dodeles.equals("") && !se.equals("") && !be.equals("") && !cr.equals(""))
			{
				try
				{
				int intcoalha = Integer.parseInt(coalha);
				int intdees = Integer.parseInt(dees);
				int intdodeles = Integer.parseInt(dodeles);
				int intse = Integer.parseInt(se);
				int intbe = Integer.parseInt(be);
				int intcr = Integer.parseInt(cr);
				int suma = (intcoalha + intdees + intdodeles + intse + intbe + intcr);
				puntsusy = suma;
				opsusy = true;

				punt8.setText("Puntaje: "+suma+" pts.");
				}
				catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Verifique que las calificaciones solo sean números del 0 al 10.\nNo se admiten caracteres.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);}
			}
			else
				JOptionPane.showMessageDialog(null, "Verifique que los campos de texto no estén vacíos.","¡ATENCIÓN!",JOptionPane.ERROR_MESSAGE);
			if(opbety&&opgaby&&opitzy&&opkarla&&optere&&opmafer&&opale&&opsusy)
			{
				Ganadora();
			}
		}
	}

	private void Ganadora() 
	{
		int arr[] = new int [8];
		String gan = "";
		
		arr[0] = puntbety;
		arr[1] = puntgaby;
		arr[2] = puntitzy;
		arr[3] = puntlau;
		arr[4] = punttere;
		arr[5] = puntmafer;
		arr[6] = puntale;
		arr[7] = puntsusy;
		
		for (int i = 1; i < arr.length; i++) 
			for (int j = 0; j < arr.length-i; j++) 
			{
				if (arr[j]>arr[j+1])
				{
					int aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}
		
		if(arr[7] == puntbety)
		{
			gan = "Jovana";
		}
		if(arr[7] == puntgaby)
		{
			gan = "Alejandra";
		}
		if(arr[7] == puntitzy)
		{
			gan = "MaryLuz";
		}
		if(arr[7] == puntlau)
		{
			gan = "Karla";
		}
		if(arr[7] == punttere)
		{
			gan = "Tere";
		}
		if(arr[7] == puntmafer)
		{
			gan = "Mafer";
		}
		if(arr[7] == puntale)
		{
			gan = "Ale";
		}
		if(arr[7] == puntsusy)
		{
			gan = "Susy";
		}
		
		JOptionPane.showMessageDialog(null,"La ganadora es: "+gan,"GANADORA",JOptionPane.INFORMATION_MESSAGE);
	}
}

class Informacion extends JDialog implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel nombr,alt,pes,pasatiempo,ciuda,carrer,semestr,fondo,pasatiemposs,eda;
	JButton cerrar;
	URL fond;
	
	public Informacion(JFrame vent, boolean mod, String nombre, String altura, String peso, String pasatiempos,String edad, String ciudad, String carrera, String semestre)
	{
		super(vent,mod);
		this.setSize(300, 400);
		super.setTitle("Información de "+nombre);
		this.setLayout(null);
		alt = new JLabel("Altura: "+altura);
			alt.setBounds(10, 30, 200, 20);
			alt.setForeground(Color.white);
			alt.setFont(new Font("Calibri",Font.BOLD,18));
		pes = new JLabel("Peso: "+peso);
			pes.setBounds(10, 60, 200, 20);
			pes.setForeground(Color.white);
			pes.setFont(new Font("Calibri",Font.BOLD,18));
		pasatiempo = new JLabel("Pasatiempos: ");
			pasatiempo.setBounds(10, 90, 200, 20);
			pasatiempo.setForeground(Color.white);
			pasatiempo.setFont(new Font("Calibri",Font.BOLD,18));
		pasatiemposs = new JLabel(pasatiempos);
			pasatiemposs.setBounds(10, 110, 300, 20);
			pasatiemposs.setForeground(Color.white);
			pasatiemposs.setFont(new Font("Calibri",Font.BOLD,18));
		eda = new JLabel("Edad: "+edad);
			eda.setBounds(10, 160, 200, 20);
			eda.setForeground(Color.white);
			eda.setFont(new Font("Calibri",Font.BOLD,18));
		ciuda = new JLabel("Ciudad de origen: "+ciudad);
			ciuda.setBounds(10, 190, 300, 20);
			ciuda.setForeground(Color.white);
			ciuda.setFont(new Font("Calibri",Font.BOLD,18));
		carrer = new JLabel("Carrera: "+carrera);
			carrer.setBounds(10, 220, 300, 20);
			carrer.setForeground(Color.white);
			carrer.setFont(new Font("Calibri",Font.BOLD,18));
		semestr = new JLabel("Semestre: "+semestre);
			semestr.setBounds(10, 250, 300, 20);
			semestr.setForeground(Color.white);
			semestr.setFont(new Font("Calibri",Font.BOLD,18));
		fond = getClass().getResource("/Beaute_Resources/fonver.png");
		cerrar = new JButton("Cerrar");
			cerrar.setBounds(70, 300, 150, 30);
		fondo = new JLabel();
			fondo.setIcon(new ImageIcon(fond));
			fondo.setBounds(0,0,300,500);
		
		cerrar.addActionListener(this);
		add(eda);add(pasatiemposs);add(cerrar);add(semestr);add(carrer);add(ciuda);add(pasatiempo);add(pes);add(alt);add(fondo);
		this.setBounds(980, 70, 300, 400);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == cerrar)
		{
			this.setVisible(false);
		}
	}
}

class Acerca extends JWindow implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel titulo,desc,desc2,desc3,copyright1,copyright2,copyright3,bydv,loading,img,ver,logo;
	JButton aceptar;
	URL fond,ico;
	
	public Acerca()
	{
		this.setLayout(null);
		this.setSize(400, 300);
		this.setBounds(500,250,400,300);
		
		fond = getClass().getResource("/Beaute_Resources/fondoinicio.jpg");
		ico = getClass().getResource("/Beaute_Resources/logo.png");
		img = new JLabel();
			img.setIcon(new ImageIcon(fond));
			img.setBounds(0,-50,500,500);
			img.setOpaque(true);
		titulo = new JLabel("Beauté");
			titulo.setForeground(Color.white);
			titulo.setFont(new Font("Forte",Font.PLAIN,38));
			titulo.setBounds(45, 75, 200, 50);
		desc = new JLabel("Sistema Integral de Calificación para Certamenes,");
			desc.setForeground(Color.white);
			desc.setFont(new Font("Calibri",Font.BOLD,14));
			desc.setBounds(60, 190, 300, 50);
		desc2 = new JLabel("desarrollado en JAVA para uso específico.");
			desc2.setForeground(Color.white);
			desc2.setFont(new Font("Calibri",Font.BOLD,14));
			desc2.setBounds(83, 205, 300, 50);
		desc3 = new JLabel("Linux + Java IDE JDK 1.7 OpenSource");
			desc3.setForeground(Color.white);
			desc3.setFont(new Font("Calibri",Font.BOLD,14));
			desc3.setBounds(100, 220, 300, 50);
		copyright1 = new JLabel("© Copyright Beauté ITJ 2012. Todos los derechos reservados. Beauté ver.1.0 es un");
			copyright1.setForeground(new Color(238,238,238));
			copyright1.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright1.setBounds(8, 260, 400, 20);
		copyright2 = new JLabel("programa 'Open Source' de DaniVega Software, desarrollado para el certamen");
			copyright2.setForeground(new Color(238,238,238));
			copyright2.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright2.setBounds(17, 270, 400, 20);
		copyright3 = new JLabel("Señorita Tecnológico 2012 Instituto Tecnológico de Jiquilpan.");
			copyright3.setForeground(new Color(238,238,238));
			copyright3.setFont(new Font("Calibri",Font.PLAIN,11));
			copyright3.setBounds(52, 280, 300, 20);
		bydv = new JLabel("by DaniVega");
			bydv.setForeground(new Color(238,238,238));
			bydv.setFont(new Font("Freestyle Script",Font.PLAIN,24));
			bydv.setBounds(130, 100, 300, 50);
		loading = new JLabel();
			loading.setForeground(Color.white);
			loading.setFont(new Font("Calibri",Font.PLAIN,12));
			loading.setBounds(50, 155, 300, 50);
		ver = new JLabel("1.0");
			ver.setForeground(new Color(238,238,238));
			ver.setFont(new Font("Calibri",Font.PLAIN,10));
			ver.setBounds(158, 84, 300, 50);
		logo = new JLabel();
			logo.setIcon(new ImageIcon(ico));
			logo.setBounds(45, 0, 100, 100);
		aceptar = new JButton("Aceptar");
			aceptar.setBounds(50, 150, 300, 20);
		
		add(desc3);add(desc2);add(aceptar);add(logo);add(ver);add(loading);add(bydv);add(copyright3);add(copyright2);add(copyright1);add(titulo);add(desc);add(img);
		aceptar.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == aceptar)
		{
			this.setVisible(false);
		}
	}
}