import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.table.*;

public class Interfaz extends javax.swing.JFrame {

// Declaracion de Grupos A,B y C y de cada equipo    
    
Object [] coltab = {"Equipo","PG","PJ","V","E","D","GA","GP","%"};

String [][] elgrupoa = {
    {"Argentina","0","0","0","0","0","0","0","0.00"},
    {"Bolivia","0","0","0","0","0","0","0","0.00"},
    {"Colombia","0","0","0","0","0","0","0","0.00"},
    {"Costa Rica","0","0","0","0","0","0","0","0.00"}
};
String [][] elgrupob = {
    {"Brasil","0","0","0","0","0","0","0","0.00"},
    {"Ecuador","0","0","0","0","0","0","0","0.00"},
    {"Paraguay","0","0","0","0","0","0","0","0.00"},
    {"Venezuela","0","0","0","0","0","0","0","0.00"}
};
String [][] elgrupoc = {
    {"Chile","0","0","0","0","0","0","0","0.00"},
    {"Mexico","0","0","0","0","0","0","0","0.00"},
    {"Peru","0","0","0","0","0","0","0","0.00"},
    {"Uruguay","0","0","0","0","0","0","0","0.00"}
};
String [][] terceros = {
    {"","0","0","0","0","0","0","0","0.00"},
    {"","0","0","0","0","0","0","0","0.00"},
    {"","0","0","0","0","0","0","0","0.00"}
};

Object [] columestad = 
{"Nº","Nombre","D","DA","G","GP","FdJ","FR","FC","AT","TA","TR"};

String [][] Argentinatitular = {
    {"23","Sergio German Romero (A)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Javier Zanetti (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Gabriel Milito (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Nicolás Burdisso (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Pablo Javier Sabaleta (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Javier Mascherano (V)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Sergio Aguero (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Lionel Messi (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Fernando Gago (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Angel Di Maria (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Gonzalo Higuain (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Argentinasuplentes = {
    {"1","Juan Carrizo (A)","0","0","0","0","0","0","0","0","0","0"},
    {"12","Mariano Andújar (A)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Nicolás Pareja (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Ezequiel Garay (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Marcos Alberto Rojo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Esteban Cambiasso (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Lucas Rodrigo Biglia(V)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Javier Pastore (V)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Ever Maximiliano Banega (V)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Diego Milito (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Ezequiel Lavezzi (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Carlos Tevez (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Boliviatitular = {
    {"1","Carlos Erwin Arias (A)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Roland Raldes (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Lorgio Alvarez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Ronald Rivero (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Luis Alberto Gutiérrez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Joselito Vaca (V)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Walter Flores (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Jaime Robles (V)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Jhasmany Campos (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Marcelo Moreno (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Edivaldo Rojas Hermoza (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Boliviasuplentes = {
    {"23","Sergio Galarza (A)","0","0","0","0","0","0","0","0","0","0"},
    {"12","Daniel Vaca (A)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Miguel Hoyos (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Santos Amador (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"19","José Chávez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Christian Vargas (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Mauricio Saucedo (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Ronald García (V)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Rudy Cardozo (V)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Ricardo Pedriel (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Alcides Peña Jimenez (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Juan Carlos Arce (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Colombiatitular = {
    {"12","Luis Enrique Martinez (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Mario Yepes (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Luis Perea (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Pablo Armero (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Camilo Zúñiga (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Abel Enrique Tapias Aguilar (V)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Gustavo Bolívar (V)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Fredy Alejandro Guarin (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Gustavo Ramos (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Dayro Mauricio Moreno (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Radamel Falcao Garcia (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Colombiasuplentes = {
    {"1","Nelson Ramos (A)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Bréiner Castillo (A)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Yulian Anchico (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Aquivaldo Mosquera (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Cristian Valencia Zapata (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Juan Valencia (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Elkin Soto (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Juan G. Cuadrado (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Carlos Sánchez Moreno (V)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Hugo Rodallega (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Jackson Martínez (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Teófilo Antonio Gutiérrez (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Costaricatitular = {
    {"18","Leonel Moreira (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Johnny Acosta (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Oscar Duarte Gaitán (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","José Andrés Salvatierra (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Francisco Calvo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","David Guzman (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Pedro Leal (V)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Diego Madrigal (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Heiner Mora (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Randall Brenes (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"12","Joel Campbell (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Costaricasuplentes = {
    {"1","Minor Alvarez (A)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Danny Carvajal (A)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Kevin Fajardo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Jorge Ignacio Gatgens Quirós (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Jose Cubero (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Allen Guevara Zúniga (V)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Hansell Arauz (V)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Luis Miguel Valle (V)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Cesar Elizondo (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Josue Martínez (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Jorge Castro (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"","","","","","","","","","","",""}
};
String [][] Brasiltitular = {
    {"1","Júlio César (A)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Dani Alves (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"6","André Santos (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Thiago Silva (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Lúcio (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Lucas (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Paulo Henrique (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Ramires (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Robinho (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Pato (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Neymar (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Brasilsuplentes = {
    {"12","Victor (A)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Jefferson (A)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Maicon (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Luisao (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"23","David Luiz (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Elano (V)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Adriano (V)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Elias (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Sandro Raniere Guimaraes Cordeiro (V)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Lucas (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Jadson (V)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Fred (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Ecuadortitular = {
    {"1","Marcelo Elizaga (A)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Néicer Reasco Yano (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Walter Ayovi (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Fricson Erazo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Norberto Araujo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Edison Mendez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Segundo Castillo (V)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Antonio Valencia (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Cristian Fernandez Noboa (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Felipe Caicedo (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Cristian Benitez (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Ecuadorsuplentes = {
    {"12","Máximo Banquera (A)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Alexander Domínguez Carabalí (A)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Geovanni Caicedo Banner Quiñones (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Luis Armando Checa (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Gabriel Achillier (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Diego Calderón (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Mario David Quiroz (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Michael Antonio Arroyo Mina (V)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Tilson Minda (V)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Arrinton Narciso Mina (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Geovanny Nazareno (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Edson Montaño (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Paraguaytitular = {
    {"1","Justo Villar (A)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Dario Verón (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Aureliano Torres (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Iván Piris (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Paulo Da Silva (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Néstor Ortigoza (V)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Cristian Riveros (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Edgar Barreto (V)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Marcelo Estigarribia (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Roque Santa Cruz (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Lucas Barrios (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Paraguaysuplentes = {
    {"12","Diego Barreto (A)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Roberto Junior Fernández (A)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Elvis Marecos (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Marcos Cáceres (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Antolín Alcaraz (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Jonathan Santana (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Víctor Cáceres (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Osvaldo Martínez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Enrique Vera (V)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Hérnan Pérez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Pablo Zeballos (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Nélson Haedo Váldez (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Venezuelatitular = {
    {"1","Renny Vicente Vega (A)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Oswaldo Vizcarrondo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Grenddy Perozo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Roberto Rosales (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Gabriel Cíchero (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Juan Fernando Arango (V)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Franklin Lucena (V)","0","0","0","0","0","0","0","0","0","0"},
    {"11","César González (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Tomás Rincón (V)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Salomon Rondon (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Miku (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Venezuelasuplentes = {
    {"12","Leonardo Morales (A)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Dani Hernandez (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","José Manuel Rey (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","José Granados (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Alexander González (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Luis Seijas (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Yoandry Orozco (V)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Giacomo Di Giorgio (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Giancarlos Maldonado (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Alejandro Moreno (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Daniel Arismendi (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Jesús Meza (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Chiletitular = {
    {"12","Miguel Pinto (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Waldo Ponce (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Gonzalo Jara (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Marco Estrada (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Gonzalo Fierro (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Carlos Carmona (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Jean Beausejour (V)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Luis Antonio Jiménez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Francisco Silva (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Humberto Suaro (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Esteban Paredes (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Chilesuplentes = {
    {"1","Claudio Andrés Bravo (A)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Paulo Garcés (A)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Pablo Contreras (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Arturo Vidal (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Matias Fernández (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Jorge Valdivia (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Rodrigo Javier Millar (V)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Gary Medel (V)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Mauricio Isla (V)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Felipe Gutiérrez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Alexis Sánchez (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Carlos Muñoz (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Mexicotitular = {
    {"1","Luis Michel (A)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Hiram Ricardo Mier Alanís (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Néstor Alejandro Araujo Razo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Héctor Reynoso Lépez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Paul Aguilar (V)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Darvin Francisco Chávez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Jorge Enriquez Garcia (V)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Diego Reyes Rosales (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Giovani Dos Santos (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Javier Aquino Carmona (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Rafael Márquez Lugo (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Mexicosuplentes = {
    {"12","Liborio Vicente Sanchez (A)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Carlos Felipe Rodríguez Rangel (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Oswaldo Alanís Pantoja (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Miguel Ponce (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Kristian Alvarez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Carlos Orrantía Treviño (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Ulises Dávila Plascencia (V)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Diego Eduardo De Buen Juárez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Antonio Gallardo Palacios (V)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Edgar Iván Pacheco Rodríguez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Alan Pulido (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Oribe Peralta Morones (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Perutitular = {
    {"1","Raúl Fernandez (A)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Walter Vilchez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Santiago Acasiete (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Renzo Revoredo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Alberto Rodríguez (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Paulo Rinaldo Cruzado (V)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Adan Balbin (V)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Michael Guevara (V)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Victor Yotum (V)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Luis Advincula Castrillon (V)","0","0","0","0","0","0","0","0","0","0"},
    {"9","José Paolo Guerrero (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Perusuplentes = {
    {"12","Salomón Libman (A)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Leao Brutón (A)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Giancarlo Carmona (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Christian Ramos (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Aldo Corzo (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Carlos Lobatón (V)","0","0","0","0","0","0","0","0","0","0"},
    {"22","Antonio Gonzales (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Josepmir Ballón (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Juan Manuel Vargas Risco (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"18","William Chiroque (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Raúl Ruidíaz (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"20","André Carrillo (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Uruguaytitular = {
    {"1","Néstor Fernando Muslera (A)","0","0","0","0","0","0","0","0","0","0"},
    {"2","Diego Lugano (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"16","Víctor Maximiliano Pereira (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"5","Mauricio Victorino (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"22","José Martín Caceres (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"15","Diego Pérez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"17","Egidio Arévalo (V)","0","0","0","0","0","0","0","0","0","0"},
    {"14","Nicolás Lodeiro (V)","0","0","0","0","0","0","0","0","0","0"},
    {"10","Diego Forlán (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"9","Luis Suárez (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"21","Edison Cavani (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] Uruguaysuplentes = {
    {"12","Juan Castillo (A)","0","0","0","0","0","0","0","0","0","0"},
    {"23","Martin Silva (A)","0","0","0","0","0","0","0","0","0","0"},
    {"3","Diego Godín (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"19","Andrés Scotti (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"4","Sebastian Coates (DF)","0","0","0","0","0","0","0","0","0","0"},
    {"8","Sebastian Eguren Vazquez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"7","Cristian Gabriel Rodríguez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"11","Alvaro Pereira (V)","0","0","0","0","0","0","0","0","0","0"},
    {"6","Walter Alejandro Gargano (V)","0","0","0","0","0","0","0","0","0","0"},
    {"20","Alvaro Gonzalez (V)","0","0","0","0","0","0","0","0","0","0"},
    {"13","Sebastián Abreu (DEL)","0","0","0","0","0","0","0","0","0","0"},
    {"18","Abel Hernandez (DEL)","0","0","0","0","0","0","0","0","0","0"}
};
String [][] auxequipo1;
String [][] auxequipo2;
String [][] auxsup1;
String [][] auxsup2;
String auxeq1;
String auxeq2;

// Declaracion de variables para el metodo penalty
private int penal;
private int penales1;
private int penales2;
//Declaracion de variables para el metodo
private int auxgol1;
private int auxgol2;
private int auxama1;
private int auxama2;
private int auxroja1;
private int auxroja2;

private int auxfalta1;
private int auxfalta2;
private int auxfdj1;
private int auxfdj2;
private int auxata1;
private int auxata2;

// imagenes para barra de gamecast
ImageIcon baloncito;
ImageIcon tarjetamarilla;
ImageIcon tarjetaroja;
// imagen vacia
ImageIcon nula;
// las banderas pequeñas del calendario
ImageIcon banderaargentina;
ImageIcon banderabolivia;
ImageIcon banderacolombia;
ImageIcon banderacostarica;
ImageIcon banderabrasil;
ImageIcon banderaecuador;
ImageIcon banderaparaguay;
ImageIcon banderavenezuela;
ImageIcon banderachile;
ImageIcon banderamexico;
ImageIcon banderaperu;
ImageIcon banderauruguay;
// las banderas grandes para el cuadro de honor
ImageIcon banderaargentina2;
ImageIcon banderabolivia2;
ImageIcon banderacolombia2;
ImageIcon banderacostarica2;
ImageIcon banderabrasil2;
ImageIcon banderaecuador2;
ImageIcon banderaparaguay2;
ImageIcon banderavenezuela2;
ImageIcon banderachile2;
ImageIcon banderamexico2;
ImageIcon banderaperu2;
ImageIcon banderauruguay2;

// declaracion de variable tipo musica para el sonido
Hilo hilo;
// declaracion del hilo
private int opcion;
// variable para cambiar de boton play
private int faltas1;
private int tiros1;
private int fueradejuego1;
private int amarilla1;
private int roja1;
private int atajada1;
private int disparos1;
private int disparco1;
private int disparco2;
private int faltas2;
private int tiros2;
private int fueradejuego2;
private int amarilla2;
private int roja2;
private int atajada2;
private int disparos2;
private int posesion1;
private int posesion2;
private int goleada1;
private int goleada2;
// declaracion de variables globales donde se almacenaran valores del partidol generados aleatoriamente
DefaultTableModel modelo1;
DefaultTableModel modelo2;
DefaultTableModel modelo3;

DefaultTableModel titulares1;
DefaultTableModel suplentes1;
DefaultTableModel titulares2;
DefaultTableModel suplentes2;

DefaultTableCellRenderer tcr;

// Constructor de la interfaz grafica

    public Interfaz() {
        modelo1 = new DefaultTableModel(elgrupoa,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo2 = new DefaultTableModel(elgrupob,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo3 = new DefaultTableModel(elgrupoc,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
                              
        initComponents();
        
        grupoa.setModel(modelo1);
        grupob.setModel(modelo2);
        grupoc.setModel(modelo3);
        
        baloncito = new ImageIcon("src/imagenescopa/baloncito.png");
        tarjetamarilla = new ImageIcon("src/imagenescopa/amarilla.png");
        tarjetaroja = new ImageIcon("src/imagenescopa/roja.png");
        
        banderaargentina = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Argentina.svg.png");
        banderabolivia = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Bolivia.svg.png");
        banderacolombia = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Colombia.svg.png");
        banderacostarica = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Costa_Rica.svg.png");
        banderabrasil = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Brazil.svg.png");
        banderaecuador = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Ecuador.svg.png");
        banderaparaguay = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Paraguay.svg.png");
        banderavenezuela = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Venezuela.svg.png");
        banderachile = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Chile.svg.png");
        banderamexico = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Mexico.svg.png");
        banderaperu = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Peru.svg.png");
        banderauruguay = new ImageIcon("src/imagenescopa/Banderas/30px-Flag_of_Uruguay.svg.png");

        banderaargentina2 = new ImageIcon("src/imagenescopa/Banderas/argentina.png");
        banderabolivia2 = new ImageIcon("src/imagenescopa/Banderas/bolivia.png");
        banderacolombia2 = new ImageIcon("src/imagenescopa/Banderas/colombia.png");
        banderacostarica2 = new ImageIcon("src/imagenescopa/Banderas/costa rica.png");
        banderabrasil2 = new ImageIcon("src/imagenescopa/Banderas/brasil.png");
        banderaecuador2 = new ImageIcon("src/imagenescopa/Banderas/ecuador.png");
        banderaparaguay2 = new ImageIcon("src/imagenescopa/Banderas/paraguay.png");
        banderavenezuela2 = new ImageIcon("src/imagenescopa/Banderas/venezuela.png");
        banderachile2 = new ImageIcon("src/imagenescopa/Banderas/chile.png");
        banderamexico2 = new ImageIcon("src/imagenescopa/Banderas/mexico.png");
        banderaperu2 = new ImageIcon("src/imagenescopa/Banderas/peru.png");
        banderauruguay2 = new ImageIcon("src/imagenescopa/Banderas/uruguay.png");
        
        nula = new ImageIcon();

        borrargamecast();
        
        // cambia cuadritos de arbol de cuartos de final a blanco
        qf1.setBackground(new java.awt.Color(255, 255, 255));
        qf2.setBackground(new java.awt.Color(255, 255, 255));
        qf3.setBackground(new java.awt.Color(255, 255, 255));
        qf4.setBackground(new java.awt.Color(255, 255, 255));
        qf5.setBackground(new java.awt.Color(255, 255, 255));
        qf6.setBackground(new java.awt.Color(255, 255, 255));
        qf7.setBackground(new java.awt.Color(255, 255, 255));
        qf8.setBackground(new java.awt.Color(255, 255, 255));
        qfre1.setBackground(new java.awt.Color(255, 255, 255));
        qfre2.setBackground(new java.awt.Color(255, 255, 255));
        qfre3.setBackground(new java.awt.Color(255, 255, 255));
        qfre4.setBackground(new java.awt.Color(255, 255, 255));
        qfre5.setBackground(new java.awt.Color(255, 255, 255));
        qfre6.setBackground(new java.awt.Color(255, 255, 255));
        qfre7.setBackground(new java.awt.Color(255, 255, 255));
        qfre8.setBackground(new java.awt.Color(255, 255, 255));
        
        // cambia cuadritos de arbol de semifinal a blanco
        sf1.setBackground(new java.awt.Color(255, 255, 255));
        sf2.setBackground(new java.awt.Color(255, 255, 255));
        sf3.setBackground(new java.awt.Color(255, 255, 255));
        sf4.setBackground(new java.awt.Color(255, 255, 255));
        sfre1.setBackground(new java.awt.Color(255, 255, 255));
        sfre2.setBackground(new java.awt.Color(255, 255, 255));
        sfre3.setBackground(new java.awt.Color(255, 255, 255));
        sfre4.setBackground(new java.awt.Color(255, 255, 255));
        
        // cambia cuadritos de arbol de final a blanco
        f1.setBackground(new java.awt.Color(255, 255, 255));
        f2.setBackground(new java.awt.Color(255, 255, 255));
        fre1.setBackground(new java.awt.Color(255, 255, 255));
        fre2.setBackground(new java.awt.Color(255, 255, 255));
        
        
        // cambia cuadritos de arbol de tercer y cuarto lugar a blanco
        tq1.setBackground(new java.awt.Color(255, 255, 255));
        tq2.setBackground(new java.awt.Color(255, 255, 255));
        tqre1.setBackground(new java.awt.Color(255, 255, 255));
        tqre2.setBackground(new java.awt.Color(255, 255, 255));
        
        // cambia cuadritos de resultados en el calendario  a blanco
        ra1.setBackground(new java.awt.Color(255, 255, 255));
        ra2.setBackground(new java.awt.Color(255, 255, 255));
        rb1.setBackground(new java.awt.Color(255, 255, 255));
        rb2.setBackground(new java.awt.Color(255, 255, 255));        
        rc1.setBackground(new java.awt.Color(255, 255, 255));
        rc2.setBackground(new java.awt.Color(255, 255, 255));
        rd1.setBackground(new java.awt.Color(255, 255, 255));
        rd2.setBackground(new java.awt.Color(255, 255, 255));
        re1.setBackground(new java.awt.Color(255, 255, 255));
        re2.setBackground(new java.awt.Color(255, 255, 255));        
        rf1.setBackground(new java.awt.Color(255, 255, 255));
        rf2.setBackground(new java.awt.Color(255, 255, 255));        
        rg1.setBackground(new java.awt.Color(255, 255, 255));
        rg2.setBackground(new java.awt.Color(255, 255, 255));        
        rh1.setBackground(new java.awt.Color(255, 255, 255));
        rh2.setBackground(new java.awt.Color(255, 255, 255));        
        ri1.setBackground(new java.awt.Color(255, 255, 255));
        ri2.setBackground(new java.awt.Color(255, 255, 255));        
        rj1.setBackground(new java.awt.Color(255, 255, 255));
        rj2.setBackground(new java.awt.Color(255, 255, 255));        
        rk1.setBackground(new java.awt.Color(255, 255, 255));
        rk2.setBackground(new java.awt.Color(255, 255, 255));        
        rl1.setBackground(new java.awt.Color(255, 255, 255));
        rl2.setBackground(new java.awt.Color(255, 255, 255));        
        rm1.setBackground(new java.awt.Color(255, 255, 255));
        rm2.setBackground(new java.awt.Color(255, 255, 255));        
        rn1.setBackground(new java.awt.Color(255, 255, 255));
        rn2.setBackground(new java.awt.Color(255, 255, 255));        
        ro1.setBackground(new java.awt.Color(255, 255, 255));
        ro2.setBackground(new java.awt.Color(255, 255, 255));
        rp1.setBackground(new java.awt.Color(255, 255, 255));
        rp2.setBackground(new java.awt.Color(255, 255, 255));        
        rq1.setBackground(new java.awt.Color(255, 255, 255));
        rq2.setBackground(new java.awt.Color(255, 255, 255));        
        rr1.setBackground(new java.awt.Color(255, 255, 255));
        rr2.setBackground(new java.awt.Color(255, 255, 255));
        rs1.setBackground(new java.awt.Color(255, 255, 255));
        rs2.setBackground(new java.awt.Color(255, 255, 255));
        rt1.setBackground(new java.awt.Color(255, 255, 255));
        rt2.setBackground(new java.awt.Color(255, 255, 255));
        ru1.setBackground(new java.awt.Color(255, 255, 255));
        ru2.setBackground(new java.awt.Color(255, 255, 255));
        rv1.setBackground(new java.awt.Color(255, 255, 255));
        rv2.setBackground(new java.awt.Color(255, 255, 255));
        rw1.setBackground(new java.awt.Color(255, 255, 255));
        rw2.setBackground(new java.awt.Color(255, 255, 255));
        rx1.setBackground(new java.awt.Color(255, 255, 255));
        rx2.setBackground(new java.awt.Color(255, 255, 255));
        ry1.setBackground(new java.awt.Color(255, 255, 255));
        ry2.setBackground(new java.awt.Color(255, 255, 255));
        rz1.setBackground(new java.awt.Color(255, 255, 255));
        rz2.setBackground(new java.awt.Color(255, 255, 255));
        
        campeon.setBackground(new java.awt.Color(255, 255, 255));
        subcampeon.setBackground(new java.awt.Color(255, 255, 255));
        tercer.setBackground(new java.awt.Color(255, 255, 255));
        cuarto.setBackground(new java.awt.Color(255, 255, 255));
       
        // Centrar valores de las columnas de las tablas
        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        
        redisenargrupoa();
        redisenargrupob();
        redisenargrupoc();
        redisenarestadisticasequipo1();
        redisenarestadisticasequipo2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfaz = new javax.swing.JTabbedPane();
        calendario = new JEImagePanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sede = new JEImagePanel();
        fechas = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        rm2 = new javax.swing.JTextField();
        rm1 = new javax.swing.JTextField();
        rl1 = new javax.swing.JTextField();
        rl2 = new javax.swing.JTextField();
        rk2 = new javax.swing.JTextField();
        rk1 = new javax.swing.JTextField();
        rj1 = new javax.swing.JTextField();
        rj2 = new javax.swing.JTextField();
        ri2 = new javax.swing.JTextField();
        ri1 = new javax.swing.JTextField();
        rh1 = new javax.swing.JTextField();
        rh2 = new javax.swing.JTextField();
        rg2 = new javax.swing.JTextField();
        rg1 = new javax.swing.JTextField();
        rf1 = new javax.swing.JTextField();
        rf2 = new javax.swing.JTextField();
        re2 = new javax.swing.JTextField();
        re1 = new javax.swing.JTextField();
        rd1 = new javax.swing.JTextField();
        rd2 = new javax.swing.JTextField();
        rc2 = new javax.swing.JTextField();
        rc1 = new javax.swing.JTextField();
        rb1 = new javax.swing.JTextField();
        rb2 = new javax.swing.JTextField();
        ra2 = new javax.swing.JTextField();
        ra1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        play3 = new javax.swing.JButton();
        play1 = new javax.swing.JButton();
        play2 = new javax.swing.JButton();
        play4 = new javax.swing.JButton();
        play5 = new javax.swing.JButton();
        play6 = new javax.swing.JButton();
        play7 = new javax.swing.JButton();
        play8 = new javax.swing.JButton();
        play9 = new javax.swing.JButton();
        play10 = new javax.swing.JButton();
        play11 = new javax.swing.JButton();
        play12 = new javax.swing.JButton();
        play13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        ro2 = new javax.swing.JTextField();
        ro1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        rp1 = new javax.swing.JTextField();
        rp2 = new javax.swing.JTextField();
        rq1 = new javax.swing.JTextField();
        rq2 = new javax.swing.JTextField();
        rr1 = new javax.swing.JTextField();
        rr2 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        rv2 = new javax.swing.JTextField();
        ru2 = new javax.swing.JTextField();
        ru1 = new javax.swing.JTextField();
        rv1 = new javax.swing.JTextField();
        rt1 = new javax.swing.JTextField();
        rt2 = new javax.swing.JTextField();
        rs2 = new javax.swing.JTextField();
        rs1 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cuartos2 = new javax.swing.JLabel();
        cuartos4 = new javax.swing.JLabel();
        cuartos6 = new javax.swing.JLabel();
        cuartos8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cuartos1 = new javax.swing.JLabel();
        cuartos3 = new javax.swing.JLabel();
        cuartos5 = new javax.swing.JLabel();
        cuartos7 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        rn1 = new javax.swing.JTextField();
        rn2 = new javax.swing.JTextField();
        play14 = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        play15 = new javax.swing.JButton();
        play16 = new javax.swing.JButton();
        play17 = new javax.swing.JButton();
        play18 = new javax.swing.JButton();
        play19 = new javax.swing.JButton();
        play20 = new javax.swing.JButton();
        play21 = new javax.swing.JButton();
        play22 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        semis1 = new javax.swing.JLabel();
        semis3 = new javax.swing.JLabel();
        rw1 = new javax.swing.JTextField();
        rw2 = new javax.swing.JTextField();
        rx2 = new javax.swing.JTextField();
        rx1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        semis2 = new javax.swing.JLabel();
        semis4 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        granfinal1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        granfinal2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        perdedores1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        perdedores2 = new javax.swing.JLabel();
        ry1 = new javax.swing.JTextField();
        ry2 = new javax.swing.JTextField();
        rz1 = new javax.swing.JTextField();
        rz2 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        play23 = new javax.swing.JButton();
        play24 = new javax.swing.JButton();
        play25 = new javax.swing.JButton();
        play26 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        tercer = new javax.swing.JTextField();
        cuarto = new javax.swing.JTextField();
        subcampeon = new javax.swing.JTextField();
        campeon = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        bandprimer = new javax.swing.JLabel();
        bandsegun = new javax.swing.JLabel();
        bandtercer = new javax.swing.JLabel();
        bandcuarto = new javax.swing.JLabel();
        grupos = new JEImagePanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grupoa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        grupoc = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        qf1 = new javax.swing.JTextField();
        qf2 = new javax.swing.JTextField();
        qf3 = new javax.swing.JTextField();
        qf4 = new javax.swing.JTextField();
        qf5 = new javax.swing.JTextField();
        qf6 = new javax.swing.JTextField();
        qf7 = new javax.swing.JTextField();
        qf8 = new javax.swing.JTextField();
        sf1 = new javax.swing.JTextField();
        sf2 = new javax.swing.JTextField();
        sf3 = new javax.swing.JTextField();
        sf4 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grupob = new javax.swing.JTable();
        tq1 = new javax.swing.JTextField();
        tq2 = new javax.swing.JTextField();
        qfre1 = new javax.swing.JTextField();
        qfre2 = new javax.swing.JTextField();
        qfre3 = new javax.swing.JTextField();
        qfre4 = new javax.swing.JTextField();
        qfre5 = new javax.swing.JTextField();
        qfre6 = new javax.swing.JTextField();
        qfre7 = new javax.swing.JTextField();
        qfre8 = new javax.swing.JTextField();
        fre1 = new javax.swing.JTextField();
        sfre1 = new javax.swing.JTextField();
        sfre2 = new javax.swing.JTextField();
        sfre3 = new javax.swing.JTextField();
        sfre4 = new javax.swing.JTextField();
        fre2 = new javax.swing.JTextField();
        tqre1 = new javax.swing.JTextField();
        tqre2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        estadisticas = new JEImagePanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        estadisticasxequipo = new javax.swing.JTabbedPane();
        estadisticaequipo1 = new JEImagePanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        suplente1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        titular1 = new javax.swing.JTable();
        estadisticaequipo2 = new JEImagePanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        suplente2 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        titular2 = new javax.swing.JTable();
        gamecast = new JEImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo = new JEImagePanel();
        equipoa1 = new javax.swing.JLabel();
        equipob1 = new javax.swing.JLabel();
        goles1 = new javax.swing.JLabel();
        goles2 = new javax.swing.JLabel();
        empezar = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        penalty = new javax.swing.JButton();
        ficha = new JEImagePanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        equipoa3 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        disp1 = new javax.swing.JLabel();
        falt1 = new javax.swing.JLabel();
        tiro1 = new javax.swing.JLabel();
        fj1 = new javax.swing.JLabel();
        tp1 = new javax.swing.JLabel();
        ta1 = new javax.swing.JLabel();
        tr1 = new javax.swing.JLabel();
        ata1 = new javax.swing.JLabel();
        disp2 = new javax.swing.JLabel();
        falt2 = new javax.swing.JLabel();
        tiro2 = new javax.swing.JLabel();
        fj2 = new javax.swing.JLabel();
        tp2 = new javax.swing.JLabel();
        ta2 = new javax.swing.JLabel();
        tr2 = new javax.swing.JLabel();
        ata2 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        equipob3 = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        tiempo = new javax.swing.JProgressBar();
        equipoa2 = new javax.swing.JLabel();
        equipob2 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        bola18 = new javax.swing.JLabel();
        bola6 = new javax.swing.JLabel();
        bola1 = new javax.swing.JLabel();
        bola2 = new javax.swing.JLabel();
        bola3 = new javax.swing.JLabel();
        bola7 = new javax.swing.JLabel();
        bola8 = new javax.swing.JLabel();
        bola9 = new javax.swing.JLabel();
        bola10 = new javax.swing.JLabel();
        bola11 = new javax.swing.JLabel();
        bola12 = new javax.swing.JLabel();
        bola13 = new javax.swing.JLabel();
        bola14 = new javax.swing.JLabel();
        bola15 = new javax.swing.JLabel();
        bola16 = new javax.swing.JLabel();
        bola17 = new javax.swing.JLabel();
        bola19 = new javax.swing.JLabel();
        bola21 = new javax.swing.JLabel();
        bola23 = new javax.swing.JLabel();
        bola25 = new javax.swing.JLabel();
        bola27 = new javax.swing.JLabel();
        bola35 = new javax.swing.JLabel();
        bola33 = new javax.swing.JLabel();
        bola31 = new javax.swing.JLabel();
        bola29 = new javax.swing.JLabel();
        bola20 = new javax.swing.JLabel();
        bola22 = new javax.swing.JLabel();
        bola24 = new javax.swing.JLabel();
        bola26 = new javax.swing.JLabel();
        bola28 = new javax.swing.JLabel();
        bola30 = new javax.swing.JLabel();
        bola32 = new javax.swing.JLabel();
        bola34 = new javax.swing.JLabel();
        bola36 = new javax.swing.JLabel();
        bola4 = new javax.swing.JLabel();
        bola5 = new javax.swing.JLabel();
        ama1 = new javax.swing.JLabel();
        ama3 = new javax.swing.JLabel();
        ama5 = new javax.swing.JLabel();
        ama7 = new javax.swing.JLabel();
        ama9 = new javax.swing.JLabel();
        ama11 = new javax.swing.JLabel();
        ama13 = new javax.swing.JLabel();
        ama15 = new javax.swing.JLabel();
        ama17 = new javax.swing.JLabel();
        ama19 = new javax.swing.JLabel();
        ama21 = new javax.swing.JLabel();
        ama23 = new javax.swing.JLabel();
        ama25 = new javax.swing.JLabel();
        ama27 = new javax.swing.JLabel();
        ama29 = new javax.swing.JLabel();
        ama31 = new javax.swing.JLabel();
        ama33 = new javax.swing.JLabel();
        ama35 = new javax.swing.JLabel();
        rojito1 = new javax.swing.JLabel();
        rojito3 = new javax.swing.JLabel();
        rojito5 = new javax.swing.JLabel();
        rojito7 = new javax.swing.JLabel();
        rojito9 = new javax.swing.JLabel();
        rojito11 = new javax.swing.JLabel();
        rojito13 = new javax.swing.JLabel();
        rojito15 = new javax.swing.JLabel();
        rojito17 = new javax.swing.JLabel();
        rojito19 = new javax.swing.JLabel();
        rojito21 = new javax.swing.JLabel();
        rojito23 = new javax.swing.JLabel();
        rojito25 = new javax.swing.JLabel();
        rojito27 = new javax.swing.JLabel();
        rojito29 = new javax.swing.JLabel();
        rojito31 = new javax.swing.JLabel();
        rojito33 = new javax.swing.JLabel();
        rojito35 = new javax.swing.JLabel();
        ama2 = new javax.swing.JLabel();
        rojito2 = new javax.swing.JLabel();
        ama4 = new javax.swing.JLabel();
        rojito4 = new javax.swing.JLabel();
        ama6 = new javax.swing.JLabel();
        rojito6 = new javax.swing.JLabel();
        ama8 = new javax.swing.JLabel();
        rojito8 = new javax.swing.JLabel();
        ama10 = new javax.swing.JLabel();
        rojito10 = new javax.swing.JLabel();
        ama12 = new javax.swing.JLabel();
        rojito12 = new javax.swing.JLabel();
        ama14 = new javax.swing.JLabel();
        rojito14 = new javax.swing.JLabel();
        ama16 = new javax.swing.JLabel();
        rojito16 = new javax.swing.JLabel();
        ama18 = new javax.swing.JLabel();
        rojito18 = new javax.swing.JLabel();
        ama20 = new javax.swing.JLabel();
        rojito20 = new javax.swing.JLabel();
        ama22 = new javax.swing.JLabel();
        rojito22 = new javax.swing.JLabel();
        ama24 = new javax.swing.JLabel();
        rojito24 = new javax.swing.JLabel();
        ama26 = new javax.swing.JLabel();
        rojito26 = new javax.swing.JLabel();
        ama28 = new javax.swing.JLabel();
        rojito28 = new javax.swing.JLabel();
        ama30 = new javax.swing.JLabel();
        rojito30 = new javax.swing.JLabel();
        ama32 = new javax.swing.JLabel();
        rojito32 = new javax.swing.JLabel();
        ama34 = new javax.swing.JLabel();
        rojito34 = new javax.swing.JLabel();
        ama36 = new javax.swing.JLabel();
        rojito36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interfaz.setBackground(new java.awt.Color(255, 255, 255));

        calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Fondoca.jpg"))); // NOI18N
        calendario.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/logoca.png"))); // NOI18N
        calendario.add(jLabel7);
        jLabel7.setBounds(10, 0, 216, 118);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/frase.png"))); // NOI18N
        calendario.add(jLabel8);
        jLabel8.setBounds(280, 10, 450, 51);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/conmebol.png"))); // NOI18N
        calendario.add(jLabel9);
        jLabel9.setBounds(890, 0, 78, 96);

        sede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Sede.png"))); // NOI18N

        javax.swing.GroupLayout sedeLayout = new javax.swing.GroupLayout(sede);
        sede.setLayout(sedeLayout);
        sedeLayout.setHorizontalGroup(
            sedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        sedeLayout.setVerticalGroup(
            sedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        calendario.add(sede);
        sede.setBounds(640, 220, 320, 350);

        jPanel4.setBackground(new java.awt.Color(224, 251, 224));
        jPanel4.setLayout(null);

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel112.setForeground(new java.awt.Color(0, 0, 153));
        jLabel112.setText("Grupo B - 03/07/2011 - 18:30 (21:30  GMT) - Santa Fe");
        jPanel4.add(jLabel112);
        jLabel112.setBounds(360, 130, 250, 30);

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel111.setForeground(new java.awt.Color(0, 0, 153));
        jLabel111.setText("Grupo B - 03/07/2011 - 16:00 (19:00  GMT) - La Plata");
        jPanel4.add(jLabel111);
        jLabel111.setBounds(360, 100, 250, 30);

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel110.setForeground(new java.awt.Color(0, 0, 153));
        jLabel110.setText("Grupo A - 02/07/2011 - 15:30 (18:30  GMT) - Jujuy");
        jPanel4.add(jLabel110);
        jLabel110.setBounds(360, 70, 240, 30);

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel109.setForeground(new java.awt.Color(0, 0, 153));
        jLabel109.setText("Grupo A - 01/07/2011 - 21:45 (00:45 GMT) - La Plata");
        jPanel4.add(jLabel109);
        jLabel109.setBounds(360, 40, 250, 30);

        rm2.setEditable(false);
        rm2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rm2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rm2);
        rm2.setBounds(150, 410, 20, 21);

        rm1.setEditable(false);
        rm1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rm1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rm1);
        rm1.setBounds(120, 410, 20, 21);

        rl1.setEditable(false);
        rl1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rl1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rl1);
        rl1.setBounds(120, 380, 20, 21);

        rl2.setEditable(false);
        rl2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rl2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rl2);
        rl2.setBounds(150, 380, 20, 21);

        rk2.setEditable(false);
        rk2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rk2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rk2);
        rk2.setBounds(150, 350, 20, 21);

        rk1.setEditable(false);
        rk1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rk1);
        rk1.setBounds(120, 350, 20, 21);

        rj1.setEditable(false);
        rj1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rj1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rj1);
        rj1.setBounds(120, 320, 20, 21);

        rj2.setEditable(false);
        rj2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rj2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rj2);
        rj2.setBounds(150, 320, 20, 21);

        ri2.setEditable(false);
        ri2.setFont(new java.awt.Font("Tahoma", 0, 12));
        ri2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ri2);
        ri2.setBounds(150, 290, 20, 21);

        ri1.setEditable(false);
        ri1.setFont(new java.awt.Font("Tahoma", 0, 12));
        ri1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ri1);
        ri1.setBounds(120, 290, 20, 21);

        rh1.setEditable(false);
        rh1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rh1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rh1);
        rh1.setBounds(120, 260, 20, 21);

        rh2.setEditable(false);
        rh2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rh2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rh2);
        rh2.setBounds(150, 260, 20, 21);

        rg2.setEditable(false);
        rg2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rg2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rg2);
        rg2.setBounds(150, 230, 20, 21);

        rg1.setEditable(false);
        rg1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rg1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rg1);
        rg1.setBounds(120, 230, 20, 21);

        rf1.setEditable(false);
        rf1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rf1);
        rf1.setBounds(120, 200, 20, 21);

        rf2.setEditable(false);
        rf2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rf2);
        rf2.setBounds(150, 200, 20, 21);

        re2.setEditable(false);
        re2.setFont(new java.awt.Font("Tahoma", 0, 12));
        re2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(re2);
        re2.setBounds(150, 170, 20, 21);

        re1.setEditable(false);
        re1.setFont(new java.awt.Font("Tahoma", 0, 12));
        re1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(re1);
        re1.setBounds(120, 170, 20, 21);

        rd1.setEditable(false);
        rd1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rd1);
        rd1.setBounds(120, 140, 20, 21);

        rd2.setEditable(false);
        rd2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rd2);
        rd2.setBounds(150, 140, 20, 21);

        rc2.setEditable(false);
        rc2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rc2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rc2);
        rc2.setBounds(150, 110, 20, 21);

        rc1.setEditable(false);
        rc1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rc1);
        rc1.setBounds(120, 110, 20, 21);

        rb1.setEditable(false);
        rb1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rb1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rb1);
        rb1.setBounds(120, 80, 20, 21);

        rb2.setEditable(false);
        rb2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rb2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(rb2);
        rb2.setBounds(150, 80, 20, 21);

        ra2.setEditable(false);
        ra2.setFont(new java.awt.Font("Tahoma", 0, 12));
        ra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ra2);
        ra2.setBounds(150, 50, 20, 21);

        ra1.setEditable(false);
        ra1.setFont(new java.awt.Font("Tahoma", 0, 12));
        ra1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ra1);
        ra1.setBounds(120, 50, 20, 21);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(null);

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Argentina.svg.png"))); // NOI18N
        jLabel91.setText("Argentina");
        jLabel91.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel91);
        jLabel91.setBounds(13, 1, 78, 20);

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Colombia.svg.png"))); // NOI18N
        jLabel92.setText("Colombia");
        jLabel92.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel92);
        jLabel92.setBounds(11, 30, 80, 30);

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Brazil.svg.png"))); // NOI18N
        jLabel93.setText("Brasil");
        jLabel93.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel93);
        jLabel93.setBounds(10, 60, 80, 30);

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Paraguay.svg.png"))); // NOI18N
        jLabel94.setText("Paraguay");
        jLabel94.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel94);
        jLabel94.setBounds(10, 90, 80, 30);

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Uruguay.svg.png"))); // NOI18N
        jLabel95.setText("Uruguay");
        jLabel95.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel95);
        jLabel95.setBounds(10, 120, 80, 19);

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Chile.svg.png"))); // NOI18N
        jLabel96.setText("Chile");
        jLabel96.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel96);
        jLabel96.setBounds(10, 150, 80, 21);

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Argentina.svg.png"))); // NOI18N
        jLabel97.setText("Argentina");
        jLabel97.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel97);
        jLabel97.setBounds(10, 180, 80, 17);

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Bolivia.svg.png"))); // NOI18N
        jLabel98.setText("Bolivia");
        jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel98);
        jLabel98.setBounds(10, 210, 80, 20);

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Uruguay.svg.png"))); // NOI18N
        jLabel99.setText("Uruguay");
        jLabel99.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel99);
        jLabel99.setBounds(10, 240, 80, 19);

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Peru.svg.png"))); // NOI18N
        jLabel100.setText("Peru");
        jLabel100.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel100);
        jLabel100.setBounds(20, 270, 70, 20);

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Brazil.svg.png"))); // NOI18N
        jLabel101.setText("Brasil");
        jLabel101.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel101);
        jLabel101.setBounds(30, 300, 60, 21);

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Venezuela.svg.png"))); // NOI18N
        jLabel102.setText("Venezuela");
        jLabel102.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel102);
        jLabel102.setBounds(10, 330, 80, 20);

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Colombia.svg.png"))); // NOI18N
        jLabel103.setText("Colombia");
        jLabel103.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel103);
        jLabel103.setBounds(10, 360, 80, 20);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(10, 45, 100, 390);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(null);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Bolivia.svg.png"))); // NOI18N
        jLabel48.setText("Bolivia");
        jLabel48.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel48);
        jLabel48.setBounds(11, 1, 85, 20);

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Costa_Rica.svg.png"))); // NOI18N
        jLabel74.setText("Costa Rica");
        jLabel74.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel74);
        jLabel74.setBounds(10, 30, 80, 30);

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Venezuela.svg.png"))); // NOI18N
        jLabel75.setText("Venezuela");
        jLabel75.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel75);
        jLabel75.setBounds(10, 60, 85, 30);

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Ecuador.svg.png"))); // NOI18N
        jLabel76.setText("Ecuador");
        jLabel76.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel76);
        jLabel76.setBounds(10, 90, 85, 30);

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Peru.svg.png"))); // NOI18N
        jLabel77.setText("Peru");
        jLabel77.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel77);
        jLabel77.setBounds(10, 120, 85, 19);

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Mexico.svg.png"))); // NOI18N
        jLabel78.setText("Mexico");
        jLabel78.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel78);
        jLabel78.setBounds(10, 150, 85, 19);

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Colombia.svg.png"))); // NOI18N
        jLabel79.setText("Colombia");
        jLabel79.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel79);
        jLabel79.setBounds(10, 180, 85, 19);

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Costa_Rica.svg.png"))); // NOI18N
        jLabel80.setText("Costa Rica");
        jLabel80.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel80);
        jLabel80.setBounds(10, 210, 80, 20);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Chile.svg.png"))); // NOI18N
        jLabel81.setText("Chile");
        jLabel81.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel81);
        jLabel81.setBounds(10, 240, 85, 20);

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Mexico.svg.png"))); // NOI18N
        jLabel82.setText("Mexico");
        jLabel82.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel82);
        jLabel82.setBounds(10, 270, 85, 20);

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Paraguay.svg.png"))); // NOI18N
        jLabel83.setText("Paraguay");
        jLabel83.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel83);
        jLabel83.setBounds(10, 300, 85, 20);

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Ecuador.svg.png"))); // NOI18N
        jLabel84.setText("Ecuador");
        jLabel84.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel84);
        jLabel84.setBounds(10, 330, 85, 20);

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Bolivia.svg.png"))); // NOI18N
        jLabel85.setText("Bolivia");
        jLabel85.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel85);
        jLabel85.setBounds(10, 360, 85, 20);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(185, 45, 110, 390);

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel113.setForeground(new java.awt.Color(0, 0, 153));
        jLabel113.setText("Grupo C - 04/07/2011 - 19:15 (22:15  GMT) - San Juan");
        jPanel4.add(jLabel113);
        jLabel113.setBounds(360, 160, 250, 30);

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel114.setForeground(new java.awt.Color(0, 0, 153));
        jLabel114.setText("Grupo C - 04/07/2011 - 21:45 (00:45  GMT) - San Juan");
        jPanel4.add(jLabel114);
        jLabel114.setBounds(360, 190, 250, 30);

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel115.setForeground(new java.awt.Color(0, 0, 153));
        jLabel115.setText("Grupo A - 06/07/2011 - 21:45 (00:45 GMT) - Santa Fe");
        jPanel4.add(jLabel115);
        jLabel115.setBounds(360, 220, 250, 30);

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel116.setForeground(new java.awt.Color(0, 0, 153));
        jLabel116.setText("Grupo A - 07/07/2011 - 19:15 (22:45 GMT) - jujuy");
        jPanel4.add(jLabel116);
        jLabel116.setBounds(360, 250, 240, 30);

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Grupo C - 08/07/2011 - 19:15 (22:45 GMT) - Mendoza");
        jPanel4.add(jLabel117);
        jLabel117.setBounds(360, 280, 250, 30);

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel118.setForeground(new java.awt.Color(0, 0, 153));
        jLabel118.setText("Grupo C - 08/07/2011 - 21:55 (00:45 GMT) - Mendoza");
        jPanel4.add(jLabel118);
        jLabel118.setBounds(360, 310, 250, 30);

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel119.setForeground(new java.awt.Color(0, 0, 153));
        jLabel119.setText("Grupo B - 09/07/2011 - 16:00 (19:00 GMT) - Cordoba");
        jPanel4.add(jLabel119);
        jLabel119.setBounds(360, 340, 250, 30);

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel120.setForeground(new java.awt.Color(0, 0, 153));
        jLabel120.setText("Grupo B - 09/07/2011 - 18:30 (21:30 GMT) - Salta");
        jPanel4.add(jLabel120);
        jLabel120.setBounds(360, 370, 240, 30);

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel122.setForeground(new java.awt.Color(0, 0, 153));
        jLabel122.setText("Grupo A - 10/07/2011 - 16:00 (19:00 GMT) - Santa Fe");
        jPanel4.add(jLabel122);
        jLabel122.setBounds(360, 400, 250, 30);

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel87.setForeground(new java.awt.Color(0, 0, 153));
        jLabel87.setText("F a s e     1");
        jPanel4.add(jLabel87);
        jLabel87.setBounds(20, 10, 108, 20);

        play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play3.setEnabled(false);
        play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play3ActionPerformed(evt);
            }
        });
        jPanel4.add(play3);
        play3.setBounds(310, 100, 30, 30);

        play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play1ActionPerformed(evt);
            }
        });
        jPanel4.add(play1);
        play1.setBounds(310, 40, 30, 30);

        play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play2.setEnabled(false);
        play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play2ActionPerformed(evt);
            }
        });
        jPanel4.add(play2);
        play2.setBounds(310, 70, 30, 30);

        play4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play4.setEnabled(false);
        play4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play4ActionPerformed(evt);
            }
        });
        jPanel4.add(play4);
        play4.setBounds(310, 130, 30, 30);

        play5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play5.setEnabled(false);
        play5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play5ActionPerformed(evt);
            }
        });
        jPanel4.add(play5);
        play5.setBounds(310, 160, 30, 30);

        play6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play6.setEnabled(false);
        play6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play6ActionPerformed(evt);
            }
        });
        jPanel4.add(play6);
        play6.setBounds(310, 190, 30, 30);

        play7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play7.setEnabled(false);
        play7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play7ActionPerformed(evt);
            }
        });
        jPanel4.add(play7);
        play7.setBounds(310, 220, 30, 30);

        play8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play8.setEnabled(false);
        play8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play8ActionPerformed(evt);
            }
        });
        jPanel4.add(play8);
        play8.setBounds(310, 250, 30, 30);

        play9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play9.setEnabled(false);
        play9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play9ActionPerformed(evt);
            }
        });
        jPanel4.add(play9);
        play9.setBounds(310, 280, 30, 30);

        play10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play10.setEnabled(false);
        play10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play10ActionPerformed(evt);
            }
        });
        jPanel4.add(play10);
        play10.setBounds(310, 310, 30, 30);

        play11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play11.setEnabled(false);
        play11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play11ActionPerformed(evt);
            }
        });
        jPanel4.add(play11);
        play11.setBounds(310, 340, 30, 30);

        play12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play12.setEnabled(false);
        play12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play12ActionPerformed(evt);
            }
        });
        jPanel4.add(play12);
        play12.setBounds(310, 370, 30, 30);

        play13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play13.setEnabled(false);
        play13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play13ActionPerformed(evt);
            }
        });
        jPanel4.add(play13);
        play13.setBounds(310, 400, 30, 30);

        fechas.addTab("(01 a 10) / 07 / 2011", jPanel4);

        jPanel5.setBackground(new java.awt.Color(224, 251, 224));
        jPanel5.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setLayout(null);

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Chile.svg.png"))); // NOI18N
        jLabel88.setText("Chile");
        jLabel88.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel88);
        jLabel88.setBounds(10, 40, 80, 20);

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Uruguay.svg.png"))); // NOI18N
        jLabel89.setText("Uruguay");
        jLabel89.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel89);
        jLabel89.setBounds(10, 70, 80, 20);

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Paraguay.svg.png"))); // NOI18N
        jLabel90.setText("Paraguay");
        jLabel90.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel90);
        jLabel90.setBounds(10, 100, 80, 18);

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Brazil.svg.png"))); // NOI18N
        jLabel105.setText("Brasil");
        jLabel105.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel105);
        jLabel105.setBounds(10, 130, 80, 21);

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Argentina.svg.png"))); // NOI18N
        jLabel104.setText("Argentina");
        jLabel104.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel104);
        jLabel104.setBounds(10, 10, 78, 20);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(10, 50, 100, 160);

        ro2.setEditable(false);
        ro2.setFont(new java.awt.Font("Tahoma", 0, 12));
        ro2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ro2);
        ro2.setBounds(150, 90, 20, 21);

        ro1.setEditable(false);
        ro1.setFont(new java.awt.Font("Tahoma", 0, 12));
        ro1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ro1);
        ro1.setBounds(120, 90, 20, 21);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setLayout(null);

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Peru.svg.png"))); // NOI18N
        jLabel106.setText("Peru");
        jLabel106.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel106);
        jLabel106.setBounds(10, 40, 83, 20);

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Mexico.svg.png"))); // NOI18N
        jLabel107.setText("Mexico");
        jLabel107.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel107);
        jLabel107.setBounds(10, 70, 83, 17);

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Venezuela.svg.png"))); // NOI18N
        jLabel108.setText("Venezuela");
        jLabel108.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel108);
        jLabel108.setBounds(10, 100, 78, 20);

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Ecuador.svg.png"))); // NOI18N
        jLabel123.setText("Ecuador");
        jLabel123.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel123);
        jLabel123.setBounds(10, 130, 83, 20);

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Banderas/30px-Flag_of_Costa_Rica.svg.png"))); // NOI18N
        jLabel86.setText("Costa Rica");
        jLabel86.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel86);
        jLabel86.setBounds(10, 10, 80, 20);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(180, 51, 100, 160);

        rp1.setEditable(false);
        rp1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rp1);
        rp1.setBounds(120, 120, 20, 21);

        rp2.setEditable(false);
        rp2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rp2);
        rp2.setBounds(150, 120, 20, 21);

        rq1.setEditable(false);
        rq1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rq1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rq1);
        rq1.setBounds(120, 150, 20, 21);

        rq2.setEditable(false);
        rq2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rq2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rq2);
        rq2.setBounds(150, 150, 20, 21);

        rr1.setEditable(false);
        rr1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rr1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rr1);
        rr1.setBounds(120, 180, 20, 21);

        rr2.setEditable(false);
        rr2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rr2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rr2);
        rr2.setBounds(150, 180, 20, 21);

        jLabel124.setBackground(new java.awt.Color(255, 255, 255));
        jLabel124.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel124.setForeground(new java.awt.Color(0, 0, 153));
        jLabel124.setText("Cuartos de final");
        jPanel5.add(jLabel124);
        jLabel124.setBounds(20, 220, 145, 33);

        rv2.setEditable(false);
        rv2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rv2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rv2);
        rv2.setBounds(160, 380, 30, 21);

        ru2.setEditable(false);
        ru2.setFont(new java.awt.Font("Tahoma", 0, 12));
        ru2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ru2);
        ru2.setBounds(160, 350, 30, 21);

        ru1.setEditable(false);
        ru1.setFont(new java.awt.Font("Tahoma", 0, 12));
        ru1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ru1);
        ru1.setBounds(120, 350, 30, 21);

        rv1.setEditable(false);
        rv1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rv1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rv1);
        rv1.setBounds(120, 380, 30, 21);

        rt1.setEditable(false);
        rt1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rt1);
        rt1.setBounds(120, 320, 30, 21);

        rt2.setEditable(false);
        rt2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rt2);
        rt2.setBounds(160, 320, 30, 21);

        rs2.setEditable(false);
        rs2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rs2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rs2);
        rs2.setBounds(160, 290, 30, 21);

        rs1.setEditable(false);
        rs1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rs1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rs1);
        rs1.setBounds(120, 290, 30, 21);

        jLabel133.setBackground(new java.awt.Color(255, 255, 255));
        jLabel133.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel133.setForeground(new java.awt.Color(0, 0, 153));
        jLabel133.setText("Fase 1 (continuacion...)");
        jPanel5.add(jLabel133);
        jLabel133.setBounds(20, 10, 206, 33);

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setLayout(null);

        cuartos2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cuartos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuartos2.setText("1º Tercero");
        cuartos2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel8.add(cuartos2);
        cuartos2.setBounds(10, 11, 80, 18);

        cuartos4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cuartos4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuartos4.setText("2C");
        cuartos4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel8.add(cuartos4);
        cuartos4.setBounds(10, 35, 80, 30);

        cuartos6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cuartos6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuartos6.setText("2º Tercero");
        cuartos6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel8.add(cuartos6);
        cuartos6.setBounds(10, 73, 80, 18);

        cuartos8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cuartos8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuartos8.setText("2B");
        cuartos8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel8.add(cuartos8);
        cuartos8.setBounds(10, 92, 80, 30);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(200, 280, 100, 130);

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setLayout(null);

        cuartos1.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuartos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuartos1.setText("1A");
        jPanel9.add(cuartos1);
        cuartos1.setBounds(8, 11, 80, 20);

        cuartos3.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuartos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuartos3.setText("2A");
        jPanel9.add(cuartos3);
        cuartos3.setBounds(8, 32, 80, 30);

        cuartos5.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuartos5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuartos5.setText("1B");
        jPanel9.add(cuartos5);
        cuartos5.setBounds(8, 67, 80, 30);

        cuartos7.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuartos7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cuartos7.setText("1C");
        jPanel9.add(cuartos7);
        cuartos7.setBounds(8, 98, 80, 21);

        jPanel5.add(jPanel9);
        jPanel9.setBounds(10, 280, 98, 130);

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel151.setForeground(new java.awt.Color(0, 0, 153));
        jLabel151.setText("17/07/2011 - 19:15 (22:15 GMT) - San Juan");
        jPanel5.add(jLabel151);
        jLabel151.setBounds(350, 380, 210, 30);

        jLabel166.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel166.setForeground(new java.awt.Color(0, 0, 153));
        jLabel166.setText("Grupo C - 12/07/2011 - 19:15 (22:15 GMT) - Mendoza");
        jPanel5.add(jLabel166);
        jLabel166.setBounds(350, 100, 250, 13);

        jLabel167.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel167.setForeground(new java.awt.Color(0, 0, 153));
        jLabel167.setText("Grupo C - 12/07/2011 - 21:45 (00:45 GMT) - La Plata");
        jPanel5.add(jLabel167);
        jLabel167.setBounds(350, 130, 250, 14);

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel168.setForeground(new java.awt.Color(0, 0, 153));
        jLabel168.setText("Grupo B - 13/07/2011 - 19:15 (22:15 GMT) - Salta");
        jPanel5.add(jLabel168);
        jLabel168.setBounds(350, 150, 240, 30);

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel169.setForeground(new java.awt.Color(0, 0, 153));
        jLabel169.setText("Grupo B - 13/07/2011 - 21:45 (00:45 GMT) - Cordoba");
        jPanel5.add(jLabel169);
        jLabel169.setBounds(350, 180, 250, 30);

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel170.setForeground(new java.awt.Color(0, 0, 153));
        jLabel170.setText("16/07/2011 - 16:00 (19:00 GMT) - Cordoba");
        jPanel5.add(jLabel170);
        jLabel170.setBounds(350, 300, 200, 14);

        jLabel171.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel171.setForeground(new java.awt.Color(0, 0, 153));
        jLabel171.setText("16/07/2011 - 19:15 (22:15 GMT) - Santa Fe");
        jPanel5.add(jLabel171);
        jLabel171.setBounds(350, 320, 200, 30);

        jLabel172.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel172.setForeground(new java.awt.Color(0, 0, 153));
        jLabel172.setText("17/07/2011 - 16:00 (19:00 GMT) - La Plata");
        jPanel5.add(jLabel172);
        jLabel172.setBounds(350, 350, 200, 30);

        rn1.setEditable(false);
        rn1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rn1);
        rn1.setBounds(120, 60, 20, 21);

        rn2.setEditable(false);
        rn2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(rn2);
        rn2.setBounds(150, 60, 20, 21);

        play14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play14.setEnabled(false);
        play14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play14ActionPerformed(evt);
            }
        });
        jPanel5.add(play14);
        play14.setBounds(310, 60, 30, 30);

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel121.setForeground(new java.awt.Color(0, 0, 153));
        jLabel121.setText("Grupo A - 11/07/2011 - 21:45 (00:45 GMT) - Cordoba");
        jPanel5.add(jLabel121);
        jLabel121.setBounds(350, 60, 250, 30);

        play15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play15.setEnabled(false);
        play15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play15ActionPerformed(evt);
            }
        });
        jPanel5.add(play15);
        play15.setBounds(310, 90, 30, 30);

        play16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play16.setEnabled(false);
        play16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play16ActionPerformed(evt);
            }
        });
        jPanel5.add(play16);
        play16.setBounds(310, 120, 30, 30);

        play17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play17.setEnabled(false);
        play17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play17ActionPerformed(evt);
            }
        });
        jPanel5.add(play17);
        play17.setBounds(310, 150, 30, 30);

        play18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play18.setEnabled(false);
        play18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play18ActionPerformed(evt);
            }
        });
        jPanel5.add(play18);
        play18.setBounds(310, 180, 30, 30);

        play19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play19.setEnabled(false);
        play19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play19ActionPerformed(evt);
            }
        });
        jPanel5.add(play19);
        play19.setBounds(310, 290, 30, 30);

        play20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play20.setEnabled(false);
        play20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play20ActionPerformed(evt);
            }
        });
        jPanel5.add(play20);
        play20.setBounds(310, 320, 30, 30);

        play21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play21.setEnabled(false);
        play21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play21ActionPerformed(evt);
            }
        });
        jPanel5.add(play21);
        play21.setBounds(310, 350, 30, 30);

        play22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play22.setEnabled(false);
        play22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play22ActionPerformed(evt);
            }
        });
        jPanel5.add(play22);
        play22.setBounds(310, 380, 30, 30);

        fechas.addTab("(11 a 17) / 07 / 2011", jPanel5);

        jPanel13.setBackground(new java.awt.Color(224, 251, 224));
        jPanel13.setLayout(null);

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel140.setForeground(new java.awt.Color(0, 0, 153));
        jLabel140.setText("3º y 4º lugar");
        jPanel13.add(jLabel140);
        jLabel140.setBounds(30, 150, 120, 33);

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));

        semis1.setFont(new java.awt.Font("Tahoma", 0, 10));
        semis1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semis1.setText("1º Ganador QF");

        semis3.setFont(new java.awt.Font("Tahoma", 0, 10));
        semis3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semis3.setText("3º Ganador QF");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(semis3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(semis1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semis1)
                .addGap(18, 18, 18)
                .addComponent(semis3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel14);
        jPanel14.setBounds(10, 60, 100, 76);

        rw1.setEditable(false);
        rw1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rw1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rw1);
        rw1.setBounds(120, 70, 30, 21);

        rw2.setEditable(false);
        rw2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rw2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rw2);
        rw2.setBounds(160, 70, 30, 21);

        rx2.setEditable(false);
        rx2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rx2);
        rx2.setBounds(160, 100, 30, 21);

        rx1.setEditable(false);
        rx1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rx1);
        rx1.setBounds(120, 100, 30, 21);

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));

        semis2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        semis2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        semis2.setText("2º Ganador QF");
        semis2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        semis4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        semis4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        semis4.setText("4º Ganador QF");
        semis4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(semis4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(semis2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semis2)
                .addGap(18, 18, 18)
                .addComponent(semis4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel15);
        jPanel15.setBounds(200, 60, 100, 76);

        jLabel145.setBackground(new java.awt.Color(255, 255, 255));
        jLabel145.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel145.setForeground(new java.awt.Color(0, 0, 153));
        jLabel145.setText("Semifinal");
        jPanel13.add(jLabel145);
        jLabel145.setBounds(30, 10, 83, 33);

        jLabel136.setBackground(new java.awt.Color(255, 255, 255));
        jLabel136.setFont(new java.awt.Font("Segoe Print", 1, 18));
        jLabel136.setForeground(new java.awt.Color(0, 0, 153));
        jLabel136.setText("Final");
        jPanel13.add(jLabel136);
        jLabel136.setBounds(30, 260, 44, 33);

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));

        granfinal1.setFont(new java.awt.Font("Tahoma", 0, 10));
        granfinal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        granfinal1.setText("1º Ganador SF");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(granfinal1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(granfinal1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel16);
        jPanel16.setBounds(10, 310, 100, 36);

        jPanel17.setBackground(new java.awt.Color(255, 255, 204));

        granfinal2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        granfinal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        granfinal2.setText("2º Ganador SF");
        granfinal2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(granfinal2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(granfinal2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel17);
        jPanel17.setBounds(200, 310, 100, 36);

        jPanel18.setBackground(new java.awt.Color(255, 255, 204));

        perdedores1.setFont(new java.awt.Font("Tahoma", 0, 10));
        perdedores1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perdedores1.setText("1º Perdedor SF");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perdedores1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perdedores1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel18);
        jPanel18.setBounds(10, 190, 100, 36);

        jPanel19.setBackground(new java.awt.Color(255, 255, 204));

        perdedores2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        perdedores2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        perdedores2.setText("1º Perdedor SF");
        perdedores2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perdedores2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perdedores2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel19);
        jPanel19.setBounds(200, 190, 100, 36);

        ry1.setEditable(false);
        ry1.setFont(new java.awt.Font("Tahoma", 0, 12));
        ry1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(ry1);
        ry1.setBounds(120, 200, 30, 21);

        ry2.setEditable(false);
        ry2.setFont(new java.awt.Font("Tahoma", 0, 12));
        ry2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(ry2);
        ry2.setBounds(160, 200, 30, 21);

        rz1.setEditable(false);
        rz1.setFont(new java.awt.Font("Tahoma", 0, 12));
        rz1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rz1);
        rz1.setBounds(120, 320, 30, 21);

        rz2.setEditable(false);
        rz2.setFont(new java.awt.Font("Tahoma", 0, 12));
        rz2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(rz2);
        rz2.setBounds(160, 320, 30, 21);

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel173.setForeground(new java.awt.Color(0, 0, 153));
        jLabel173.setText("19/07/2011 - 21:45 (00:45 GMT) - La Plata");
        jPanel13.add(jLabel173);
        jLabel173.setBounds(360, 74, 210, 20);

        jLabel174.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel174.setForeground(new java.awt.Color(0, 0, 153));
        jLabel174.setText("20/07/2011 - 21:45 (00:45 GMT) - Mendoza");
        jPanel13.add(jLabel174);
        jLabel174.setBounds(360, 110, 200, 14);

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel175.setForeground(new java.awt.Color(0, 0, 153));
        jLabel175.setText("23/07/2011 - 16:00 (19:00 GMT) - La Plata");
        jPanel13.add(jLabel175);
        jLabel175.setBounds(360, 200, 200, 14);

        jLabel176.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel176.setForeground(new java.awt.Color(0, 0, 153));
        jLabel176.setText("24/07/2011 - 16:00 (19:00 GMT) - Buenos Aires");
        jPanel13.add(jLabel176);
        jLabel176.setBounds(360, 320, 220, 14);

        play23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play23.setEnabled(false);
        play23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play23ActionPerformed(evt);
            }
        });
        jPanel13.add(play23);
        play23.setBounds(310, 70, 30, 30);

        play24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play24.setEnabled(false);
        play24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play24ActionPerformed(evt);
            }
        });
        jPanel13.add(play24);
        play24.setBounds(310, 100, 30, 30);

        play25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play25.setEnabled(false);
        play25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play25ActionPerformed(evt);
            }
        });
        jPanel13.add(play25);
        play25.setBounds(310, 190, 30, 30);

        play26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Play.png"))); // NOI18N
        play26.setEnabled(false);
        play26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play26ActionPerformed(evt);
            }
        });
        jPanel13.add(play26);
        play26.setBounds(310, 310, 30, 30);

        fechas.addTab("(19 a 24) / 07 / 2011", jPanel13);

        jPanel1.setBackground(new java.awt.Color(224, 251, 224));
        jPanel1.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setLayout(null);

        jLabel62.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24));
        jLabel62.setForeground(new java.awt.Color(0, 0, 102));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Campeón");
        jPanel10.add(jLabel62);
        jLabel62.setBounds(10, 30, 120, 31);

        jLabel63.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18));
        jLabel63.setForeground(new java.awt.Color(0, 0, 102));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Sub-Campeón");
        jPanel10.add(jLabel63);
        jLabel63.setBounds(10, 140, 120, 24);

        jLabel64.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18));
        jLabel64.setForeground(new java.awt.Color(0, 0, 102));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("3º Lugar");
        jPanel10.add(jLabel64);
        jLabel64.setBounds(10, 210, 120, 24);

        jLabel61.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18));
        jLabel61.setForeground(new java.awt.Color(0, 0, 102));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("4º Lugar");
        jPanel10.add(jLabel61);
        jLabel61.setBounds(10, 280, 120, 24);

        tercer.setEditable(false);
        tercer.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        tercer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(tercer);
        tercer.setBounds(140, 210, 150, 30);

        cuarto.setEditable(false);
        cuarto.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        cuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(cuarto);
        cuarto.setBounds(140, 280, 150, 30);

        subcampeon.setEditable(false);
        subcampeon.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        subcampeon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(subcampeon);
        subcampeon.setBounds(140, 140, 150, 30);

        campeon.setEditable(false);
        campeon.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        campeon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(campeon);
        campeon.setBounds(140, 20, 150, 50);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(20, 50, 310, 340);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/copa.png"))); // NOI18N
        jPanel1.add(jLabel57);
        jLabel57.setBounds(530, 10, 70, 170);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/oro.png"))); // NOI18N
        jPanel1.add(jLabel58);
        jLabel58.setBounds(490, 70, 26, 51);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/plata.png"))); // NOI18N
        jPanel1.add(jLabel59);
        jLabel59.setBounds(490, 180, 27, 47);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/bronce.png"))); // NOI18N
        jPanel1.add(jLabel60);
        jLabel60.setBounds(490, 250, 26, 46);
        jPanel1.add(bandprimer);
        bandprimer.setBounds(350, 60, 110, 70);
        jPanel1.add(bandsegun);
        bandsegun.setBounds(350, 170, 110, 70);
        jPanel1.add(bandtercer);
        bandtercer.setBounds(350, 240, 110, 70);
        jPanel1.add(bandcuarto);
        bandcuarto.setBounds(350, 310, 110, 70);

        fechas.addTab("Resultado Final", jPanel1);

        calendario.add(fechas);
        fechas.setBounds(20, 150, 620, 470);

        interfaz.addTab("Calendario", calendario);

        grupos.setBackground(new java.awt.Color(255, 255, 255));
        grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Fondoca.jpg"))); // NOI18N
        grupos.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/logoca.png"))); // NOI18N
        grupos.add(jLabel10);
        jLabel10.setBounds(10, 0, 216, 118);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/frase.png"))); // NOI18N
        grupos.add(jLabel11);
        jLabel11.setBounds(280, 10, 450, 51);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/conmebol.png"))); // NOI18N
        grupos.add(jLabel12);
        jLabel12.setBounds(890, 0, 78, 96);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        grupoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipo", "PG", "PJ", "V", "E", "D", "GA", "GR", "%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(grupoa);
        grupoa.getColumnModel().getColumn(0).setResizable(false);
        grupoa.getColumnModel().getColumn(1).setResizable(false);
        grupoa.getColumnModel().getColumn(2).setResizable(false);
        grupoa.getColumnModel().getColumn(3).setResizable(false);
        grupoa.getColumnModel().getColumn(4).setResizable(false);
        grupoa.getColumnModel().getColumn(5).setResizable(false);
        grupoa.getColumnModel().getColumn(6).setResizable(false);
        grupoa.getColumnModel().getColumn(7).setResizable(false);
        grupoa.getColumnModel().getColumn(8).setResizable(false);

        grupos.add(jScrollPane1);
        jScrollPane1.setBounds(10, 175, 420, 83);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        grupoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipo", "PG", "PJ", "V", "E", "D", "GA", "GR", "%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoc.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(grupoc);
        grupoc.getColumnModel().getColumn(0).setResizable(false);
        grupoc.getColumnModel().getColumn(1).setResizable(false);
        grupoc.getColumnModel().getColumn(2).setResizable(false);
        grupoc.getColumnModel().getColumn(3).setResizable(false);
        grupoc.getColumnModel().getColumn(4).setResizable(false);
        grupoc.getColumnModel().getColumn(5).setResizable(false);
        grupoc.getColumnModel().getColumn(6).setResizable(false);
        grupoc.getColumnModel().getColumn(7).setResizable(false);
        grupoc.getColumnModel().getColumn(8).setResizable(false);

        grupos.add(jScrollPane2);
        jScrollPane2.setBounds(10, 460, 420, 83);

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        jLabel13.setForeground(new java.awt.Color(40, 128, 158));
        jLabel13.setText("Grupo A - Clasificación");
        grupos.add(jLabel13);
        jLabel13.setBounds(110, 150, 202, 17);

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        jLabel14.setForeground(new java.awt.Color(40, 128, 158));
        jLabel14.setText("Grupo B - Clasificación");
        grupos.add(jLabel14);
        jLabel14.setBounds(110, 290, 203, 17);

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        jLabel15.setForeground(new java.awt.Color(40, 128, 158));
        jLabel15.setText("Grupo C - Clasificación");
        grupos.add(jLabel15);
        jLabel15.setBounds(110, 430, 204, 17);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel44.setForeground(new java.awt.Color(40, 128, 158));
        jLabel44.setText("Cuartos de final");
        grupos.add(jLabel44);
        jLabel44.setBounds(473, 151, 94, 17);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel45.setForeground(new java.awt.Color(40, 128, 158));
        jLabel45.setText("Semifinal");
        grupos.add(jLabel45);
        jLabel45.setBounds(660, 150, 52, 17);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel46.setForeground(new java.awt.Color(40, 128, 158));
        jLabel46.setText("Final");
        grupos.add(jLabel46);
        jLabel46.setBounds(830, 150, 26, 17);

        qf1.setEditable(false);
        qf1.setText("1A");
        grupos.add(qf1);
        qf1.setBounds(473, 201, 71, 20);

        qf2.setEditable(false);
        qf2.setText("1º Tercero");
        grupos.add(qf2);
        qf2.setBounds(473, 239, 71, 20);

        qf3.setEditable(false);
        qf3.setText("2A");
        grupos.add(qf3);
        qf3.setBounds(473, 312, 71, 20);

        qf4.setEditable(false);
        qf4.setText("2C");
        grupos.add(qf4);
        qf4.setBounds(473, 350, 71, 20);

        qf5.setEditable(false);
        qf5.setText("1B");
        grupos.add(qf5);
        qf5.setBounds(473, 416, 71, 20);

        qf6.setEditable(false);
        qf6.setText("2º Tercero");
        grupos.add(qf6);
        qf6.setBounds(473, 454, 71, 20);

        qf7.setEditable(false);
        qf7.setText("1C");
        grupos.add(qf7);
        qf7.setBounds(473, 513, 71, 20);

        qf8.setEditable(false);
        qf8.setText("2B");
        grupos.add(qf8);
        qf8.setBounds(473, 551, 71, 20);

        sf1.setEditable(false);
        grupos.add(sf1);
        sf1.setBounds(640, 220, 71, 20);

        sf2.setEditable(false);
        grupos.add(sf2);
        sf2.setBounds(640, 330, 71, 20);

        sf3.setEditable(false);
        grupos.add(sf3);
        sf3.setBounds(640, 430, 71, 20);

        sf4.setEditable(false);
        grupos.add(sf4);
        sf4.setBounds(640, 530, 71, 20);

        f1.setEditable(false);
        grupos.add(f1);
        f1.setBounds(810, 250, 71, 20);

        f2.setEditable(false);
        grupos.add(f2);
        f2.setBounds(810, 300, 71, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel47.setForeground(new java.awt.Color(40, 128, 158));
        jLabel47.setText("3º y 4º lugar");
        grupos.add(jLabel47);
        jLabel47.setBounds(820, 380, 80, 17);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        grupob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipo", "PG", "PJ", "V", "E", "D", "GA", "GR", "%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupob.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(grupob);
        grupob.getColumnModel().getColumn(0).setResizable(false);
        grupob.getColumnModel().getColumn(1).setResizable(false);
        grupob.getColumnModel().getColumn(2).setResizable(false);
        grupob.getColumnModel().getColumn(3).setResizable(false);
        grupob.getColumnModel().getColumn(4).setResizable(false);
        grupob.getColumnModel().getColumn(5).setResizable(false);
        grupob.getColumnModel().getColumn(6).setResizable(false);
        grupob.getColumnModel().getColumn(7).setResizable(false);
        grupob.getColumnModel().getColumn(8).setResizable(false);

        grupos.add(jScrollPane3);
        jScrollPane3.setBounds(10, 320, 420, 83);

        tq1.setEditable(false);
        grupos.add(tq1);
        tq1.setBounds(810, 460, 71, 20);

        tq2.setEditable(false);
        grupos.add(tq2);
        tq2.setBounds(810, 510, 71, 20);

        qfre1.setEditable(false);
        grupos.add(qfre1);
        qfre1.setBounds(550, 201, 30, 20);

        qfre2.setEditable(false);
        grupos.add(qfre2);
        qfre2.setBounds(550, 239, 30, 20);

        qfre3.setEditable(false);
        grupos.add(qfre3);
        qfre3.setBounds(550, 312, 30, 20);

        qfre4.setEditable(false);
        grupos.add(qfre4);
        qfre4.setBounds(550, 350, 30, 20);

        qfre5.setEditable(false);
        grupos.add(qfre5);
        qfre5.setBounds(550, 416, 30, 20);

        qfre6.setEditable(false);
        grupos.add(qfre6);
        qfre6.setBounds(550, 454, 30, 20);

        qfre7.setEditable(false);
        grupos.add(qfre7);
        qfre7.setBounds(550, 513, 30, 20);

        qfre8.setEditable(false);
        grupos.add(qfre8);
        qfre8.setBounds(550, 551, 30, 20);

        fre1.setEditable(false);
        grupos.add(fre1);
        fre1.setBounds(890, 250, 30, 20);

        sfre1.setEditable(false);
        grupos.add(sfre1);
        sfre1.setBounds(720, 220, 30, 20);

        sfre2.setEditable(false);
        grupos.add(sfre2);
        sfre2.setBounds(720, 330, 30, 20);

        sfre3.setEditable(false);
        grupos.add(sfre3);
        sfre3.setBounds(720, 430, 30, 20);

        sfre4.setEditable(false);
        grupos.add(sfre4);
        sfre4.setBounds(720, 530, 30, 20);

        fre2.setEditable(false);
        grupos.add(fre2);
        fre2.setBounds(890, 300, 30, 20);

        tqre1.setEditable(false);
        grupos.add(tqre1);
        tqre1.setBounds(890, 460, 30, 20);

        tqre2.setEditable(false);
        grupos.add(tqre2);
        tqre2.setBounds(890, 510, 30, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator1);
        jSeparator1.setBounds(610, 210, 2, 40);
        grupos.add(jSeparator2);
        jSeparator2.setBounds(580, 210, 30, 2);
        grupos.add(jSeparator3);
        jSeparator3.setBounds(580, 250, 30, 2);
        grupos.add(jSeparator4);
        jSeparator4.setBounds(580, 318, 30, 2);
        grupos.add(jSeparator6);
        jSeparator6.setBounds(580, 360, 30, 10);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator7);
        jSeparator7.setBounds(610, 320, 10, 40);
        grupos.add(jSeparator8);
        jSeparator8.setBounds(580, 420, 30, 10);
        grupos.add(jSeparator9);
        jSeparator9.setBounds(580, 460, 30, 10);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator10);
        jSeparator10.setBounds(610, 420, 10, 40);
        grupos.add(jSeparator11);
        jSeparator11.setBounds(580, 520, 30, 10);
        grupos.add(jSeparator12);
        jSeparator12.setBounds(580, 560, 30, 10);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator13);
        jSeparator13.setBounds(610, 520, 10, 40);
        grupos.add(jSeparator15);
        jSeparator15.setBounds(610, 230, 30, 10);
        grupos.add(jSeparator16);
        jSeparator16.setBounds(610, 440, 30, 2);
        grupos.add(jSeparator17);
        jSeparator17.setBounds(610, 340, 30, 10);
        grupos.add(jSeparator18);
        jSeparator18.setBounds(610, 540, 30, 10);
        grupos.add(jSeparator5);
        jSeparator5.setBounds(750, 230, 20, 10);
        grupos.add(jSeparator14);
        jSeparator14.setBounds(750, 340, 20, 10);
        grupos.add(jSeparator19);
        jSeparator19.setBounds(750, 440, 20, 10);
        grupos.add(jSeparator20);
        jSeparator20.setBounds(750, 540, 20, 10);

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator21);
        jSeparator21.setBounds(770, 230, 10, 110);

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator22);
        jSeparator22.setBounds(770, 440, 10, 100);
        grupos.add(jSeparator23);
        jSeparator23.setBounds(770, 260, 40, 2);
        grupos.add(jSeparator24);
        jSeparator24.setBounds(770, 490, 20, 10);

        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        grupos.add(jSeparator25);
        jSeparator25.setBounds(790, 312, 10, 180);
        grupos.add(jSeparator26);
        jSeparator26.setBounds(790, 310, 20, 2);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel38.setText("PG: Puntos Ganados");
        grupos.add(jLabel38);
        jLabel38.setBounds(30, 560, 110, 13);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel39.setText("PJ: Partidos Jugados");
        grupos.add(jLabel39);
        jLabel39.setBounds(140, 560, 110, 13);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel40.setText("V: Victorias");
        grupos.add(jLabel40);
        jLabel40.setBounds(250, 560, 60, 13);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel41.setText("E: Empates");
        grupos.add(jLabel41);
        jLabel41.setBounds(320, 560, 60, 13);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel42.setText("D: Derrotas");
        grupos.add(jLabel42);
        jLabel42.setBounds(30, 580, 60, 13);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel43.setText("GA: Goles Anotados");
        grupos.add(jLabel43);
        jLabel43.setBounds(100, 580, 100, 13);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel55.setText("GR: Goles Recibidos");
        grupos.add(jLabel55);
        jLabel55.setBounds(210, 580, 100, 13);

        interfaz.addTab("Grupos", grupos);

        estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Fondoca.jpg"))); // NOI18N
        estadisticas.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/logoca.png"))); // NOI18N
        estadisticas.add(jLabel4);
        jLabel4.setBounds(10, 0, 216, 118);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/frase.png"))); // NOI18N
        estadisticas.add(jLabel5);
        jLabel5.setBounds(280, 10, 450, 51);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/conmebol.png"))); // NOI18N
        estadisticas.add(jLabel6);
        jLabel6.setBounds(890, 0, 78, 96);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        suplente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "Nombre", "D", "DA", "G", "GP", "FdJ", "FR", "FC", "AT", "TA", "TR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        suplente1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(suplente1);

        jLabel16.setText("D: Disparos");

        jLabel17.setText("DA: Disparos al arco");

        jLabel18.setText("G: Goles");

        jLabel19.setText("GP: Asistencias");

        jLabel20.setText("FdJ: Fuera de juego");

        jLabel21.setText("FR: Faltas recibidas");

        jLabel22.setText("FC: Faltas cometidas");

        jLabel23.setText("AT: Atajadas");

        jLabel24.setText("TA: Tarjetas amarillas");

        jLabel25.setText("TR: Tarjetas rojas");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel27.setText("Suplentes");

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        titular1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "Nombre", "D", "DA", "G", "GP", "FdJ", "FR", "FC", "AT", "TA", "TR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        titular1.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(titular1);

        javax.swing.GroupLayout estadisticaequipo1Layout = new javax.swing.GroupLayout(estadisticaequipo1);
        estadisticaequipo1.setLayout(estadisticaequipo1Layout);
        estadisticaequipo1Layout.setHorizontalGroup(
            estadisticaequipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estadisticaequipo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estadisticaequipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, estadisticaequipo1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, estadisticaequipo1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25))
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        estadisticaequipo1Layout.setVerticalGroup(
            estadisticaequipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estadisticaequipo1Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estadisticaequipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estadisticaequipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        estadisticasxequipo.addTab("Equipo 1", estadisticaequipo1);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        suplente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "Nombre", "D", "DA", "G", "GP", "FdJ", "FR", "FC", "AT", "TA", "TR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        suplente2.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(suplente2);

        jLabel26.setText("D: Disparos");

        jLabel28.setText("DA: Disparos al arco");

        jLabel29.setText("G: Goles");

        jLabel30.setText("GP: Asistencias");

        jLabel31.setText("FdJ: Fuera de juego");

        jLabel32.setText("FR: Faltas recibidas");

        jLabel33.setText("FC: Faltas cometidas");

        jLabel34.setText("AT: Atajadas");

        jLabel35.setText("TA: Tarjetas amarillas");

        jLabel36.setText("TR: Tarjetas rojas");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel37.setText("Suplentes");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        titular2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº", "Nombre", "D", "DA", "G", "GP", "FdJ", "FR", "FC", "AT", "TA", "TR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        titular2.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(titular2);

        javax.swing.GroupLayout estadisticaequipo2Layout = new javax.swing.GroupLayout(estadisticaequipo2);
        estadisticaequipo2.setLayout(estadisticaequipo2Layout);
        estadisticaequipo2Layout.setHorizontalGroup(
            estadisticaequipo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estadisticaequipo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estadisticaequipo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, estadisticaequipo2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, estadisticaequipo2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        estadisticaequipo2Layout.setVerticalGroup(
            estadisticaequipo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estadisticaequipo2Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estadisticaequipo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estadisticaequipo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addContainerGap())
        );

        estadisticasxequipo.addTab("Equipo 2", estadisticaequipo2);

        estadisticas.add(estadisticasxequipo);
        estadisticasxequipo.setBounds(10, 124, 954, 520);

        interfaz.addTab("Estadisticas", estadisticas);

        gamecast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Fondoca.jpg"))); // NOI18N
        gamecast.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/logoca.png"))); // NOI18N
        gamecast.add(jLabel1);
        jLabel1.setBounds(10, 0, 216, 118);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/frase.png"))); // NOI18N
        gamecast.add(jLabel2);
        jLabel2.setBounds(280, 10, 450, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/conmebol.png"))); // NOI18N
        gamecast.add(jLabel3);
        jLabel3.setBounds(890, 0, 80, 96);

        campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Campo.png"))); // NOI18N
        campo.setLayout(null);

        equipoa1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        equipoa1.setForeground(new java.awt.Color(255, 255, 255));
        equipoa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        equipoa1.setText("Equipo 1");
        campo.add(equipoa1);
        equipoa1.setBounds(18, 15, 150, 21);

        equipob1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        equipob1.setForeground(new java.awt.Color(255, 255, 255));
        equipob1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipob1.setText("Equipo 2");
        campo.add(equipob1);
        equipob1.setBounds(237, 15, 160, 21);

        goles1.setFont(new java.awt.Font("Tahoma", 1, 24));
        goles1.setForeground(new java.awt.Color(255, 255, 255));
        goles1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        goles1.setText("0");
        campo.add(goles1);
        goles1.setBounds(89, 11, 107, 29);

        goles2.setFont(new java.awt.Font("Tahoma", 1, 24));
        goles2.setForeground(new java.awt.Color(255, 255, 255));
        goles2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        goles2.setText("0");
        campo.add(goles2);
        goles2.setBounds(214, 11, 112, 29);

        empezar.setBackground(new java.awt.Color(0, 0, 0));
        empezar.setForeground(new java.awt.Color(255, 255, 255));
        empezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        empezar.setText("Empezar Partido");
        empezar.setEnabled(false);
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        campo.add(empezar);
        empezar.setBounds(30, 260, 170, 27);

        terminar.setBackground(new java.awt.Color(0, 0, 0));
        terminar.setForeground(new java.awt.Color(255, 255, 255));
        terminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        terminar.setText("Guardar Resultado");
        terminar.setEnabled(false);
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });
        campo.add(terminar);
        terminar.setBounds(220, 260, 170, 27);

        penalty.setBackground(new java.awt.Color(0, 0, 0));
        penalty.setForeground(new java.awt.Color(255, 255, 255));
        penalty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        penalty.setText("Penaltys");
        penalty.setEnabled(false);
        penalty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaltyActionPerformed(evt);
            }
        });
        campo.add(penalty);
        penalty.setBounds(150, 40, 110, 27);

        gamecast.add(campo);
        campo.setBounds(50, 130, 420, 310);

        ficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/Ficha.png"))); // NOI18N
        ficha.setLayout(null);

        jLabel49.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Atajadas");
        ficha.add(jLabel49);
        jLabel49.setBounds(77, 281, 227, 30);

        jLabel50.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Tarjetas rojas");
        ficha.add(jLabel50);
        jLabel50.setBounds(77, 254, 227, 30);

        jLabel51.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Tarjetas amarillas");
        ficha.add(jLabel51);
        jLabel51.setBounds(77, 222, 227, 30);

        jLabel52.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Tiempo de posesion (%)");
        ficha.add(jLabel52);
        jLabel52.setBounds(77, 193, 227, 30);

        jLabel53.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Fuera de juego");
        ficha.add(jLabel53);
        jLabel53.setBounds(77, 163, 227, 30);

        jLabel54.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Tiros de esquina");
        ficha.add(jLabel54);
        jLabel54.setBounds(77, 134, 227, 30);

        equipoa3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        equipoa3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        equipoa3.setText("Equipo 1");
        ficha.add(equipoa3);
        equipoa3.setBounds(10, 42, 170, 21);

        jLabel56.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Faltas");
        ficha.add(jLabel56);
        jLabel56.setBounds(77, 107, 227, 21);

        disp1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        disp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disp1.setText("0(0)");
        ficha.add(disp1);
        disp1.setBounds(10, 80, 61, 21);

        falt1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        falt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        falt1.setText("0");
        ficha.add(falt1);
        falt1.setBounds(10, 107, 61, 21);

        tiro1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tiro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiro1.setText("0");
        ficha.add(tiro1);
        tiro1.setBounds(10, 134, 61, 30);

        fj1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        fj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fj1.setText("0");
        ficha.add(fj1);
        fj1.setBounds(10, 163, 61, 30);

        tp1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tp1.setText("0");
        ficha.add(tp1);
        tp1.setBounds(10, 190, 61, 30);

        ta1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        ta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ta1.setText("0");
        ficha.add(ta1);
        ta1.setBounds(10, 222, 61, 30);

        tr1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tr1.setText("0");
        ficha.add(tr1);
        tr1.setBounds(10, 254, 61, 30);

        ata1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        ata1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ata1.setText("0");
        ficha.add(ata1);
        ata1.setBounds(10, 281, 61, 30);

        disp2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        disp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disp2.setText("0(0)");
        ficha.add(disp2);
        disp2.setBounds(310, 80, 70, 21);

        falt2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        falt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        falt2.setText("0");
        ficha.add(falt2);
        falt2.setBounds(310, 107, 70, 21);

        tiro2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tiro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiro2.setText("0");
        ficha.add(tiro2);
        tiro2.setBounds(310, 139, 70, 21);

        fj2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        fj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fj2.setText("0");
        ficha.add(fj2);
        fj2.setBounds(310, 166, 70, 21);

        tp2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tp2.setText("0");
        ficha.add(tp2);
        tp2.setBounds(310, 193, 70, 30);

        ta2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        ta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ta2.setText("0");
        ficha.add(ta2);
        ta2.setBounds(310, 225, 70, 21);

        tr2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        tr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tr2.setText("0");
        ficha.add(tr2);
        tr2.setBounds(310, 252, 70, 30);

        ata2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        ata2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ata2.setText("0");
        ficha.add(ata2);
        ata2.setBounds(310, 284, 70, 20);

        jLabel73.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("F i c h a");
        ficha.add(jLabel73);
        jLabel73.setBounds(22, 11, 337, 25);

        jLabel134.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("Disparos (al arco)");
        ficha.add(jLabel134);
        jLabel134.setBounds(77, 80, 227, 21);

        equipob3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        equipob3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipob3.setText("Equipo 2");
        ficha.add(equipob3);
        equipob3.setBounds(204, 42, 170, 21);

        gamecast.add(ficha);
        ficha.setBounds(540, 130, 390, 310);

        barra.setBackground(new java.awt.Color(0, 0, 102));
        barra.setLayout(null);

        tiempo.setBackground(new java.awt.Color(204, 204, 204));
        tiempo.setForeground(new java.awt.Color(153, 0, 102));
        tiempo.setMaximum(90);
        tiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra.add(tiempo);
        tiempo.setBounds(50, 70, 810, 20);

        equipoa2.setFont(new java.awt.Font("Tahoma", 0, 12));
        equipoa2.setForeground(new java.awt.Color(204, 204, 255));
        equipoa2.setText("Equipo 1");
        barra.add(equipoa2);
        equipoa2.setBounds(10, 30, 70, 15);

        equipob2.setFont(new java.awt.Font("Tahoma", 0, 12));
        equipob2.setForeground(new java.awt.Color(204, 204, 255));
        equipob2.setText("Equipo 2");
        barra.add(equipob2);
        equipob2.setBounds(10, 110, 80, 15);

        jLabel137.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel137.setForeground(new java.awt.Color(204, 204, 255));
        jLabel137.setText("45");
        barra.add(jLabel137);
        jLabel137.setBounds(453, 11, 16, 15);

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel148.setForeground(new java.awt.Color(204, 204, 255));
        jLabel148.setText("90");
        barra.add(jLabel148);
        jLabel148.setBounds(846, 11, 16, 15);

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel149.setForeground(new java.awt.Color(204, 204, 255));
        jLabel149.setText("60");
        barra.add(jLabel149);
        jLabel149.setBounds(585, 11, 16, 15);

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel150.setForeground(new java.awt.Color(204, 204, 255));
        jLabel150.setText("75");
        barra.add(jLabel150);
        jLabel150.setBounds(714, 11, 16, 15);

        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel152.setForeground(new java.awt.Color(204, 204, 255));
        jLabel152.setText("15");
        barra.add(jLabel152);
        jLabel152.setBounds(181, 11, 16, 15);

        jLabel153.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel153.setForeground(new java.awt.Color(204, 204, 255));
        jLabel153.setText("30");
        barra.add(jLabel153);
        jLabel153.setBounds(317, 11, 16, 15);

        jLabel154.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel154.setForeground(new java.awt.Color(204, 204, 255));
        jLabel154.setText("20");
        barra.add(jLabel154);
        jLabel154.setBounds(226, 11, 16, 15);

        jLabel155.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel155.setForeground(new java.awt.Color(204, 204, 255));
        jLabel155.setText("25");
        barra.add(jLabel155);
        jLabel155.setBounds(271, 11, 16, 15);

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel156.setForeground(new java.awt.Color(204, 204, 255));
        jLabel156.setText("35");
        barra.add(jLabel156);
        jLabel156.setBounds(362, 11, 16, 15);

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel157.setForeground(new java.awt.Color(204, 204, 255));
        jLabel157.setText("40");
        barra.add(jLabel157);
        jLabel157.setBounds(407, 11, 16, 15);

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel158.setForeground(new java.awt.Color(204, 204, 255));
        jLabel158.setText("50");
        barra.add(jLabel158);
        jLabel158.setBounds(496, 11, 16, 15);

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel159.setForeground(new java.awt.Color(204, 204, 255));
        jLabel159.setText("55");
        barra.add(jLabel159);
        jLabel159.setBounds(541, 11, 16, 15);

        jLabel160.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel160.setForeground(new java.awt.Color(204, 204, 255));
        jLabel160.setText("65");
        barra.add(jLabel160);
        jLabel160.setBounds(627, 11, 16, 15);

        jLabel161.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel161.setForeground(new java.awt.Color(204, 204, 255));
        jLabel161.setText("70");
        barra.add(jLabel161);
        jLabel161.setBounds(672, 11, 16, 15);

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel162.setForeground(new java.awt.Color(204, 204, 255));
        jLabel162.setText("80");
        barra.add(jLabel162);
        jLabel162.setBounds(757, 11, 16, 15);

        jLabel163.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel163.setForeground(new java.awt.Color(204, 204, 255));
        jLabel163.setText("85");
        barra.add(jLabel163);
        jLabel163.setBounds(802, 11, 16, 15);

        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel164.setForeground(new java.awt.Color(204, 204, 255));
        jLabel164.setText("05");
        barra.add(jLabel164);
        jLabel164.setBounds(88, 11, 16, 15);

        jLabel165.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel165.setForeground(new java.awt.Color(204, 204, 255));
        jLabel165.setText("10");
        barra.add(jLabel165);
        jLabel165.setBounds(133, 11, 16, 15);

        bola18.setForeground(new java.awt.Color(255, 255, 255));
        bola18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola18);
        bola18.setBounds(450, 90, 20, 20);

        bola6.setForeground(new java.awt.Color(255, 255, 255));
        bola6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola6);
        bola6.setBounds(170, 90, 30, 20);

        bola1.setForeground(new java.awt.Color(255, 255, 255));
        bola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola1);
        bola1.setBounds(90, 50, 30, 20);

        bola2.setForeground(new java.awt.Color(255, 255, 255));
        bola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola2);
        bola2.setBounds(90, 90, 20, 20);

        bola3.setForeground(new java.awt.Color(255, 255, 255));
        bola3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola3);
        bola3.setBounds(120, 50, 40, 20);

        bola7.setForeground(new java.awt.Color(255, 255, 255));
        bola7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola7);
        bola7.setBounds(210, 50, 40, 20);

        bola8.setForeground(new java.awt.Color(255, 255, 255));
        bola8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola8);
        bola8.setBounds(220, 90, 20, 20);

        bola9.setForeground(new java.awt.Color(255, 255, 255));
        bola9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bola9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola9);
        bola9.setBounds(270, 50, 20, 20);

        bola10.setForeground(new java.awt.Color(255, 255, 255));
        bola10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bola10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola10);
        bola10.setBounds(270, 90, 20, 20);

        bola11.setForeground(new java.awt.Color(255, 255, 255));
        bola11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola11);
        bola11.setBounds(310, 50, 30, 20);

        bola12.setForeground(new java.awt.Color(255, 255, 255));
        bola12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola12);
        bola12.setBounds(310, 90, 30, 20);

        bola13.setForeground(new java.awt.Color(255, 255, 255));
        bola13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola13);
        bola13.setBounds(360, 50, 20, 20);

        bola14.setForeground(new java.awt.Color(255, 255, 255));
        bola14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola14);
        bola14.setBounds(360, 90, 20, 20);

        bola15.setForeground(new java.awt.Color(255, 255, 255));
        bola15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola15);
        bola15.setBounds(400, 50, 30, 20);

        bola16.setForeground(new java.awt.Color(255, 255, 255));
        bola16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola16);
        bola16.setBounds(400, 90, 30, 20);

        bola17.setForeground(new java.awt.Color(255, 255, 255));
        bola17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola17);
        bola17.setBounds(450, 50, 20, 20);

        bola19.setForeground(new java.awt.Color(255, 255, 255));
        bola19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola19);
        bola19.setBounds(490, 50, 30, 20);

        bola21.setForeground(new java.awt.Color(255, 255, 255));
        bola21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bola21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola21);
        bola21.setBounds(540, 50, 20, 20);

        bola23.setForeground(new java.awt.Color(255, 255, 255));
        bola23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola23);
        bola23.setBounds(580, 50, 20, 20);

        bola25.setForeground(new java.awt.Color(255, 255, 255));
        bola25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola25);
        bola25.setBounds(620, 50, 30, 20);

        bola27.setForeground(new java.awt.Color(255, 255, 255));
        bola27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola27);
        bola27.setBounds(670, 50, 20, 20);

        bola35.setForeground(new java.awt.Color(255, 255, 255));
        bola35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola35);
        bola35.setBounds(840, 50, 30, 20);

        bola33.setForeground(new java.awt.Color(255, 255, 255));
        bola33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola33);
        bola33.setBounds(800, 50, 20, 20);

        bola31.setForeground(new java.awt.Color(255, 255, 255));
        bola31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola31);
        bola31.setBounds(750, 50, 30, 20);

        bola29.setForeground(new java.awt.Color(255, 255, 255));
        bola29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola29);
        bola29.setBounds(710, 50, 20, 20);

        bola20.setForeground(new java.awt.Color(255, 255, 255));
        bola20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola20);
        bola20.setBounds(490, 90, 30, 20);

        bola22.setForeground(new java.awt.Color(255, 255, 255));
        bola22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bola22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola22);
        bola22.setBounds(540, 90, 20, 20);

        bola24.setForeground(new java.awt.Color(255, 255, 255));
        bola24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola24);
        bola24.setBounds(580, 90, 20, 20);

        bola26.setForeground(new java.awt.Color(255, 255, 255));
        bola26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola26);
        bola26.setBounds(620, 90, 30, 20);

        bola28.setForeground(new java.awt.Color(255, 255, 255));
        bola28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola28);
        bola28.setBounds(670, 90, 20, 20);

        bola30.setForeground(new java.awt.Color(255, 255, 255));
        bola30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bola30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola30);
        bola30.setBounds(710, 90, 20, 20);

        bola32.setForeground(new java.awt.Color(255, 255, 255));
        bola32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola32);
        bola32.setBounds(750, 90, 30, 20);

        bola34.setForeground(new java.awt.Color(255, 255, 255));
        bola34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola34);
        bola34.setBounds(800, 90, 20, 20);

        bola36.setForeground(new java.awt.Color(255, 255, 255));
        bola36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola36);
        bola36.setBounds(840, 90, 30, 20);

        bola4.setForeground(new java.awt.Color(255, 255, 255));
        bola4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola4);
        bola4.setBounds(130, 90, 20, 20);

        bola5.setForeground(new java.awt.Color(255, 255, 255));
        bola5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bola5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/baloncito.png"))); // NOI18N
        barra.add(bola5);
        bola5.setBounds(170, 50, 30, 20);

        ama1.setForeground(new java.awt.Color(255, 255, 255));
        ama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama1);
        ama1.setBounds(90, 30, 20, 20);

        ama3.setForeground(new java.awt.Color(255, 255, 255));
        ama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama3);
        ama3.setBounds(130, 30, 20, 20);

        ama5.setForeground(new java.awt.Color(255, 255, 255));
        ama5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama5);
        ama5.setBounds(180, 30, 10, 20);

        ama7.setForeground(new java.awt.Color(255, 255, 255));
        ama7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama7);
        ama7.setBounds(220, 30, 20, 20);

        ama9.setForeground(new java.awt.Color(255, 255, 255));
        ama9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama9);
        ama9.setBounds(270, 30, 10, 20);

        ama11.setForeground(new java.awt.Color(255, 255, 255));
        ama11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama11);
        ama11.setBounds(310, 30, 20, 20);

        ama13.setForeground(new java.awt.Color(255, 255, 255));
        ama13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ama13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama13);
        ama13.setBounds(360, 30, 10, 20);

        ama15.setForeground(new java.awt.Color(255, 255, 255));
        ama15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama15);
        ama15.setBounds(400, 30, 20, 20);

        ama17.setForeground(new java.awt.Color(255, 255, 255));
        ama17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ama17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama17);
        ama17.setBounds(450, 30, 10, 20);

        ama19.setForeground(new java.awt.Color(255, 255, 255));
        ama19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama19);
        ama19.setBounds(490, 30, 20, 20);

        ama21.setForeground(new java.awt.Color(255, 255, 255));
        ama21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama21);
        ama21.setBounds(540, 30, 10, 20);

        ama23.setForeground(new java.awt.Color(255, 255, 255));
        ama23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama23);
        ama23.setBounds(580, 30, 20, 20);

        ama25.setForeground(new java.awt.Color(255, 255, 255));
        ama25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama25);
        ama25.setBounds(620, 30, 20, 20);

        ama27.setForeground(new java.awt.Color(255, 255, 255));
        ama27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama27);
        ama27.setBounds(670, 30, 10, 20);

        ama29.setForeground(new java.awt.Color(255, 255, 255));
        ama29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama29);
        ama29.setBounds(710, 30, 20, 20);

        ama31.setForeground(new java.awt.Color(255, 255, 255));
        ama31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama31);
        ama31.setBounds(750, 30, 20, 20);

        ama33.setForeground(new java.awt.Color(255, 255, 255));
        ama33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama33);
        ama33.setBounds(800, 30, 10, 20);

        ama35.setForeground(new java.awt.Color(255, 255, 255));
        ama35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama35);
        ama35.setBounds(840, 30, 20, 20);

        rojito1.setForeground(new java.awt.Color(255, 255, 255));
        rojito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito1);
        rojito1.setBounds(100, 30, 20, 20);

        rojito3.setForeground(new java.awt.Color(255, 255, 255));
        rojito3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito3);
        rojito3.setBounds(140, 30, 20, 20);

        rojito5.setForeground(new java.awt.Color(255, 255, 255));
        rojito5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito5);
        rojito5.setBounds(190, 30, 10, 20);

        rojito7.setForeground(new java.awt.Color(255, 255, 255));
        rojito7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito7);
        rojito7.setBounds(230, 30, 20, 20);

        rojito9.setForeground(new java.awt.Color(255, 255, 255));
        rojito9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito9);
        rojito9.setBounds(280, 30, 10, 20);

        rojito11.setForeground(new java.awt.Color(255, 255, 255));
        rojito11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito11);
        rojito11.setBounds(320, 30, 20, 20);

        rojito13.setForeground(new java.awt.Color(255, 255, 255));
        rojito13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rojito13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito13);
        rojito13.setBounds(370, 30, 10, 20);

        rojito15.setForeground(new java.awt.Color(255, 255, 255));
        rojito15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito15);
        rojito15.setBounds(410, 30, 20, 20);

        rojito17.setForeground(new java.awt.Color(255, 255, 255));
        rojito17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rojito17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito17);
        rojito17.setBounds(460, 30, 10, 20);

        rojito19.setForeground(new java.awt.Color(255, 255, 255));
        rojito19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito19);
        rojito19.setBounds(500, 30, 20, 20);

        rojito21.setForeground(new java.awt.Color(255, 255, 255));
        rojito21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito21);
        rojito21.setBounds(550, 30, 10, 20);

        rojito23.setForeground(new java.awt.Color(255, 255, 255));
        rojito23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito23);
        rojito23.setBounds(590, 30, 20, 20);

        rojito25.setForeground(new java.awt.Color(255, 255, 255));
        rojito25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito25);
        rojito25.setBounds(630, 30, 20, 20);

        rojito27.setForeground(new java.awt.Color(255, 255, 255));
        rojito27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito27);
        rojito27.setBounds(680, 30, 10, 20);

        rojito29.setForeground(new java.awt.Color(255, 255, 255));
        rojito29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito29);
        rojito29.setBounds(720, 30, 20, 20);

        rojito31.setForeground(new java.awt.Color(255, 255, 255));
        rojito31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito31);
        rojito31.setBounds(760, 30, 20, 20);

        rojito33.setForeground(new java.awt.Color(255, 255, 255));
        rojito33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito33);
        rojito33.setBounds(810, 30, 10, 20);

        rojito35.setForeground(new java.awt.Color(255, 255, 255));
        rojito35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito35);
        rojito35.setBounds(850, 30, 20, 20);

        ama2.setForeground(new java.awt.Color(255, 255, 255));
        ama2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama2);
        ama2.setBounds(90, 110, 20, 20);

        rojito2.setForeground(new java.awt.Color(255, 255, 255));
        rojito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito2);
        rojito2.setBounds(100, 110, 20, 20);

        ama4.setForeground(new java.awt.Color(255, 255, 255));
        ama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama4);
        ama4.setBounds(130, 110, 20, 20);

        rojito4.setForeground(new java.awt.Color(255, 255, 255));
        rojito4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito4);
        rojito4.setBounds(140, 110, 20, 20);

        ama6.setForeground(new java.awt.Color(255, 255, 255));
        ama6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama6);
        ama6.setBounds(180, 110, 10, 20);

        rojito6.setForeground(new java.awt.Color(255, 255, 255));
        rojito6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito6);
        rojito6.setBounds(190, 110, 10, 20);

        ama8.setForeground(new java.awt.Color(255, 255, 255));
        ama8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama8);
        ama8.setBounds(220, 110, 20, 20);

        rojito8.setForeground(new java.awt.Color(255, 255, 255));
        rojito8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito8);
        rojito8.setBounds(230, 110, 20, 20);

        ama10.setForeground(new java.awt.Color(255, 255, 255));
        ama10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama10);
        ama10.setBounds(270, 110, 10, 20);

        rojito10.setForeground(new java.awt.Color(255, 255, 255));
        rojito10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito10);
        rojito10.setBounds(280, 110, 10, 20);

        ama12.setForeground(new java.awt.Color(255, 255, 255));
        ama12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama12);
        ama12.setBounds(310, 110, 20, 20);

        rojito12.setForeground(new java.awt.Color(255, 255, 255));
        rojito12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito12);
        rojito12.setBounds(320, 110, 20, 20);

        ama14.setForeground(new java.awt.Color(255, 255, 255));
        ama14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ama14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama14);
        ama14.setBounds(360, 110, 10, 20);

        rojito14.setForeground(new java.awt.Color(255, 255, 255));
        rojito14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rojito14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito14);
        rojito14.setBounds(370, 110, 10, 20);

        ama16.setForeground(new java.awt.Color(255, 255, 255));
        ama16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama16);
        ama16.setBounds(400, 110, 20, 20);

        rojito16.setForeground(new java.awt.Color(255, 255, 255));
        rojito16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito16);
        rojito16.setBounds(410, 110, 20, 20);

        ama18.setForeground(new java.awt.Color(255, 255, 255));
        ama18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ama18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama18);
        ama18.setBounds(450, 110, 10, 20);

        rojito18.setForeground(new java.awt.Color(255, 255, 255));
        rojito18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rojito18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito18);
        rojito18.setBounds(460, 110, 10, 20);

        ama20.setForeground(new java.awt.Color(255, 255, 255));
        ama20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama20);
        ama20.setBounds(490, 110, 20, 20);

        rojito20.setForeground(new java.awt.Color(255, 255, 255));
        rojito20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito20);
        rojito20.setBounds(500, 110, 20, 20);

        ama22.setForeground(new java.awt.Color(255, 255, 255));
        ama22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama22);
        ama22.setBounds(540, 110, 10, 20);

        rojito22.setForeground(new java.awt.Color(255, 255, 255));
        rojito22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito22);
        rojito22.setBounds(550, 110, 10, 20);

        ama24.setForeground(new java.awt.Color(255, 255, 255));
        ama24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama24);
        ama24.setBounds(580, 110, 20, 20);

        rojito24.setForeground(new java.awt.Color(255, 255, 255));
        rojito24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito24);
        rojito24.setBounds(590, 110, 20, 20);

        ama26.setForeground(new java.awt.Color(255, 255, 255));
        ama26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama26);
        ama26.setBounds(620, 110, 20, 20);

        rojito26.setForeground(new java.awt.Color(255, 255, 255));
        rojito26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito26);
        rojito26.setBounds(630, 110, 20, 20);

        ama28.setForeground(new java.awt.Color(255, 255, 255));
        ama28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama28);
        ama28.setBounds(670, 110, 10, 20);

        rojito28.setForeground(new java.awt.Color(255, 255, 255));
        rojito28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito28);
        rojito28.setBounds(680, 110, 10, 20);

        ama30.setForeground(new java.awt.Color(255, 255, 255));
        ama30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama30);
        ama30.setBounds(710, 110, 20, 20);

        rojito30.setForeground(new java.awt.Color(255, 255, 255));
        rojito30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito30);
        rojito30.setBounds(720, 110, 20, 20);

        ama32.setForeground(new java.awt.Color(255, 255, 255));
        ama32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama32);
        ama32.setBounds(750, 110, 20, 20);

        rojito32.setForeground(new java.awt.Color(255, 255, 255));
        rojito32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito32);
        rojito32.setBounds(760, 110, 20, 20);

        ama34.setForeground(new java.awt.Color(255, 255, 255));
        ama34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama34);
        ama34.setBounds(800, 110, 10, 20);

        rojito34.setForeground(new java.awt.Color(255, 255, 255));
        rojito34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito34);
        rojito34.setBounds(810, 110, 10, 20);

        ama36.setForeground(new java.awt.Color(255, 255, 255));
        ama36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ama36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/amarilla.png"))); // NOI18N
        barra.add(ama36);
        ama36.setBounds(840, 110, 20, 20);

        rojito36.setForeground(new java.awt.Color(255, 255, 255));
        rojito36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rojito36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenescopa/roja.png"))); // NOI18N
        barra.add(rojito36);
        rojito36.setBounds(850, 110, 20, 20);

        gamecast.add(barra);
        barra.setBounds(30, 470, 910, 140);

        interfaz.addTab("Gamecast", gamecast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Metodo encargado de resetear contadores y etiquetas de la ficha
    public final void borrartodo(){
        faltas1=tiros1=fueradejuego1=amarilla1=roja1=atajada1=disparos1=0;
        faltas2=tiros2=fueradejuego2=amarilla2=roja2=atajada2=disparos2=0;
        posesion1=posesion2=goleada1=goleada2=disparco1=disparco2=0;
        borrargamecast();
        disp1.setText("0(0)");
        falt1.setText("0");
        tiro1.setText("0");
        fj1.setText("0");
        tp1.setText("0");
        ta1.setText("0");
        tr1.setText("0");
        ata1.setText("0");
        goles1.setText("0");
        disp2.setText("0(0)");
        falt2.setText("0");
        tiro2.setText("0");
        fj2.setText("0");
        tp2.setText("0");
        ta2.setText("0");
        tr2.setText("0");
        ata2.setText("0");
        goles2.setText("0");
    } 
    // metodo en desuso   
    public void generartodo(){
        faltas1 = (int)(Math.round(Math.random()*8))+7;
        faltas2 = (int)(Math.round(Math.random()*8))+7;
        tiros1 = (int)(Math.round(Math.random()*7))+1;
        tiros2 = (int)(Math.round(Math.random()*7))+1;
        fueradejuego1 = (int)(Math.round(Math.random()*5))+1;
        fueradejuego2 = (int)(Math.round(Math.random()*5))+1;
        amarilla1 = (int)(Math.round(Math.random()*8));
        amarilla2 = (int)(Math.round(Math.random()*8));
        roja1 = (int)(Math.round(Math.random()*2));
        roja2 = (int)(Math.round(Math.random()*2));
        disparos1 =(int)(Math.round(Math.random()*10));
        disparos2 =(int)(Math.round(Math.random()*10));
        posesion1 = (int)(Math.round(Math.random()*40))+30;
        posesion2 = 100 - posesion1;
        atajada1 = (int)(Math.round(Math.random()*disparos2));
        atajada2 = (int)(Math.round(Math.random()*disparos1));
        goleada1 = (int)(Math.round(Math.random()*(disparos1 - atajada2)));
        goleada2 = (int)(Math.round(Math.random()*(disparos2 - atajada1)));
    }
    // metodo dedicado a mostrar valores de ficha respecto al tiempo
    public void mostrartodo(){
        goles1.setText(Integer.toString(goleada1));
        goles2.setText(Integer.toString(goleada2));
        disp1.setText(Integer.toString(disparos1)+"("+Integer.toString(disparco1)+")");
        disp2.setText(Integer.toString(disparos2)+"("+Integer.toString(disparco2)+")");
        falt1.setText(Integer.toString(faltas1));
        falt2.setText(Integer.toString(faltas2));
        tiro1.setText(Integer.toString(tiros1));
        tiro2.setText(Integer.toString(tiros2));
        fj1.setText(Integer.toString(fueradejuego1));
        fj2.setText(Integer.toString(fueradejuego2));
        tp1.setText(Integer.toString(posesion1));
        tp2.setText(Integer.toString(posesion2));
        ta1.setText(Integer.toString(amarilla1));
        ta2.setText(Integer.toString(amarilla2));
        tr1.setText(Integer.toString(roja1));
        tr2.setText(Integer.toString(roja2));
        ata1.setText(Integer.toString(atajada1));
        ata2.setText(Integer.toString(atajada2));
    }    
    
        public void bandprimersegun(String equipo1, String equipo2){
        if(equipo1.equals("Argentina"))
            bandprimer.setIcon(banderaargentina2);
        if(equipo2.equals("Argentina"))
            bandsegun.setIcon(banderaargentina2);
        if(equipo1.equals("Bolivia"))
            bandprimer.setIcon(banderabolivia2);
        if(equipo2.equals("Bolivia"))
            bandsegun.setIcon(banderabolivia2);
        if(equipo1.equals("Colombia"))
            bandprimer.setIcon(banderacolombia2);
        if(equipo2.equals("Colombia"))
            bandsegun.setIcon(banderacolombia2);
        if(equipo1.equals("Costa Rica"))
            bandprimer.setIcon(banderacostarica2);
        if(equipo2.equals("Costa Rica"))
            bandsegun.setIcon(banderacostarica2);
        if(equipo1.equals("Brasil"))
            bandprimer.setIcon(banderabrasil2);
        if(equipo2.equals("Brasil"))
            bandsegun.setIcon(banderabrasil2);
        if(equipo1.equals("Venezuela"))
            bandprimer.setIcon(banderavenezuela2);
        if(equipo2.equals("Venezuela"))
            bandsegun.setIcon(banderavenezuela2);
        if(equipo1.equals("Paraguay"))
            bandprimer.setIcon(banderaparaguay2);
        if(equipo2.equals("Paraguay"))
            bandsegun.setIcon(banderaparaguay2);
        if(equipo1.equals("Ecuador"))
            bandprimer.setIcon(banderaecuador2);
        if(equipo2.equals("Ecuador"))
            bandsegun.setIcon(banderaecuador2);
        if(equipo1.equals("Uruguay"))
            bandprimer.setIcon(banderauruguay2);
        if(equipo2.equals("Uruguay"))
            bandsegun.setIcon(banderauruguay2);
        if(equipo1.equals("Peru"))
            bandprimer.setIcon(banderaperu2);
        if(equipo2.equals("Peru"))
            bandsegun.setIcon(banderaperu2);
        if(equipo1.equals("Chile"))
            bandprimer.setIcon(banderachile2);
        if(equipo2.equals("Chile"))
            bandsegun.setIcon(banderachile2);
        if(equipo1.equals("Mexico"))
            bandprimer.setIcon(banderamexico2);
        if(equipo2.equals("Mexico"))
            bandsegun.setIcon(banderamexico2);
    }
    
    public void bandtercercuarto(String equipo1, String equipo2){
        if(equipo1.equals("Argentina"))
            bandtercer.setIcon(banderaargentina2);
        if(equipo2.equals("Argentina"))
            bandcuarto.setIcon(banderaargentina2);
        if(equipo1.equals("Bolivia"))
            bandtercer.setIcon(banderabolivia2);
        if(equipo2.equals("Bolivia"))
            bandcuarto.setIcon(banderabolivia2);
        if(equipo1.equals("Colombia"))
            bandtercer.setIcon(banderacolombia2);
        if(equipo2.equals("Colombia"))
            bandcuarto.setIcon(banderacolombia2);
        if(equipo1.equals("Costa Rica"))
            bandtercer.setIcon(banderacostarica2);
        if(equipo2.equals("Costa Rica"))
            bandcuarto.setIcon(banderacostarica2);
        if(equipo1.equals("Brasil"))
            bandtercer.setIcon(banderabrasil2);
        if(equipo2.equals("Brasil"))
            bandcuarto.setIcon(banderabrasil2);
        if(equipo1.equals("Venezuela"))
            bandtercer.setIcon(banderavenezuela2);
        if(equipo2.equals("Venezuela"))
            bandcuarto.setIcon(banderavenezuela2);
        if(equipo1.equals("Paraguay"))
            bandtercer.setIcon(banderaparaguay2);
        if(equipo2.equals("Paraguay"))
            bandcuarto.setIcon(banderaparaguay2);
        if(equipo1.equals("Ecuador"))
            bandtercer.setIcon(banderaecuador2);
        if(equipo2.equals("Ecuador"))
            bandcuarto.setIcon(banderaecuador2);
        if(equipo1.equals("Uruguay"))
            bandtercer.setIcon(banderauruguay2);
        if(equipo2.equals("Uruguay"))
            bandcuarto.setIcon(banderauruguay2);
        if(equipo1.equals("Peru"))
            bandtercer.setIcon(banderaperu2);
        if(equipo2.equals("Peru"))
            bandcuarto.setIcon(banderaperu2);
        if(equipo1.equals("Chile"))
            bandtercer.setIcon(banderachile2);
        if(equipo2.equals("Chile"))
            bandcuarto.setIcon(banderachile2);
        if(equipo1.equals("Mexico"))
            bandtercer.setIcon(banderamexico2);
        if(equipo2.equals("Mexico"))
            bandcuarto.setIcon(banderamexico2);
    }
    
    /***************************************************************************
     * Aqui esta dedicado a la parte del gamecast:                             *
     *                                                                         *
     * La barra de tiempo (metodo hilo), valores del partido aleatorios        *
     * (metodo generarlento), goles y tarjetas en el tiempo (metodo            *
     * mostraricono) y el reseteo de los valores a cero (metodo borrargamecast)*
     ***************************************************************************/
    
    public class Hilo extends Thread {
    JProgressBar progreso;

    public Hilo(JProgressBar progreso1){       
        super();
        this.progreso=progreso1;
    }
    @Override
    public void run(){
        posesion1=50;
        posesion2=50;
        for(int i=1;i<=90;i++){
            progreso.setValue(i);
            if(i%5==0){
                generarlento();
                mostraricono(i);
            }
            if(i==90){
                penal=0;
                if((opcion>18)&&(goleada1==goleada2)){
                    penalty.setEnabled(true);
                    penal=1;
                }
                else
                    terminar.setEnabled(true);
            }
            pausa(90);
        }
    }
    public void pausa(int mlSeg){
        try{
            // pausa para el splash
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    // public void eeeel fume 
    public void generarlento(){
        // auxiliares usados para los iconos de la barra del gamecast
        auxgol1=goleada1;
        auxgol2=goleada2;
        auxama1=amarilla1;
        auxama2=amarilla2;
        auxroja1=roja1;
        auxroja2=roja2;
        // Estos auxiliares y los anteriores son utilizados en estadisticas
        auxfalta1=faltas1;
        auxfalta2=faltas2;
        auxfdj1=fueradejuego1;
        auxfdj2=fueradejuego2;
        auxata1=atajada1;
        auxata2=atajada2;
       
 
        if((faltas1<16)&&(faltas2<16)){
            faltas1 = faltas1 + (int)(Math.round(Math.random()*0.8)+0);
            if(auxfalta1<faltas1){
                int i=(int)(Math.round(Math.random()*9)+1);
                auxequipo1[i][7]=Integer.toString(Integer.parseInt(auxequipo1[i][7])+1);
                int j=(int)(Math.round(Math.random()*9)+1);
                auxequipo2[j][8]=Integer.toString(Integer.parseInt(auxequipo2[j][8])+1);
            }
            faltas2 = faltas2 + (int)(Math.round(Math.random()*0.8)+0);
            if(auxfalta2<faltas2){
                int i=(int)(Math.round(Math.random()*9)+1);
                auxequipo2[i][7]=Integer.toString(Integer.parseInt(auxequipo2[i][7])+1);
                int j=(int)(Math.round(Math.random()*9)+1);
                auxequipo1[j][8]=Integer.toString(Integer.parseInt(auxequipo1[j][8])+1);
            }
        }
        if((tiros1<9)&&(tiros2<9)){
            tiros1 = tiros1 + (int)(Math.round(Math.random()*0.8)+0);
            tiros2 = tiros2 + (int)(Math.round(Math.random()*0.8)+0);
        }
        if((fueradejuego1<7)&&(fueradejuego2<7)){
            fueradejuego1 = fueradejuego1 + (int)(Math.round(Math.random()*0.59)+0);
            if(auxfdj1<fueradejuego1){
                int i=(int)(Math.round(Math.random()*9)+1);
                auxequipo1[i][6]=Integer.toString(Integer.parseInt(auxequipo1[i][6])+1);
            }
            fueradejuego2 = fueradejuego2 + (int)(Math.round(Math.random()*0.59)+0);
            if(auxfdj2<fueradejuego2){
                int i=(int)(Math.round(Math.random()*9)+1);
                auxequipo2[i][6]=Integer.toString(Integer.parseInt(auxequipo2[i][6])+1);
            }
        }
        if((amarilla1<6)&&(amarilla2<6)){
            int i;
            amarilla1 = amarilla1 + (int)(Math.round(Math.random()*0.54)+0);
            if(auxama1<amarilla1){
                do{
                    i=(int)(Math.round(Math.random()*9)+1);
                }while(Integer.parseInt(auxequipo1[i][10])>=2);
                
                auxequipo1[i][10]=Integer.toString(Integer.parseInt(auxequipo1[i][10])+1);
                if(Integer.parseInt(auxequipo1[i][10])==2){
                    roja1=roja1+1;
                    auxroja1=roja1;
                    auxequipo1[i][11]=Integer.toString(Integer.parseInt(auxequipo1[i][11])+1);
                }
            }
            amarilla2 = amarilla2 + (int)(Math.round(Math.random()*0.54)+0);
            if(auxama2<amarilla2){
                do{
                    i=(int)(Math.round(Math.random()*9)+1);
                }while(Integer.parseInt(auxequipo2[i][10])>=2);
                
                auxequipo2[i][10]=Integer.toString(Integer.parseInt(auxequipo2[i][10])+1);
                if(Integer.parseInt(auxequipo2[i][10])==2){
                    roja2=roja2+1;
                    auxroja2=roja2;
                    auxequipo2[i][11]=Integer.toString(Integer.parseInt(auxequipo2[i][11])+1);
                }
            }
        }
        if(roja1<1){
            int i;
            roja1 = roja1 + (int)(Math.round(Math.random()*0.508)+0);
            if(auxroja1<roja1){
                do{
                    i=(int)(Math.round(Math.random()*9)+1);
                }while(Integer.parseInt(auxequipo1[i][11])>0);
                auxequipo1[i][11]=Integer.toString(Integer.parseInt(auxequipo1[i][11])+1);
            }
        }
        if(roja2<1){
            int i;
            roja2 = roja2 + (int)(Math.round(Math.random()*0.508)+0);
            if(auxroja2<roja2){
                do{
                    i=(int)(Math.round(Math.random()*9)+1);
                }while(Integer.parseInt(auxequipo2[i][11])>0);
                auxequipo2[i][11]=Integer.toString(Integer.parseInt(auxequipo2[i][11])+1);
            }
        }
        // disparo, disparo al arco, atajada del equipo contrario
        if((disparos1<20)&&(disparos2<20)){
            int aux = 0;
            int i=(int)(Math.round(Math.random()*9)+1);
            aux = (int)(Math.round(Math.random()*1)+0);
            disparos1 = disparos1 + aux;
            if(aux==1)
                auxequipo1[i][2]=Integer.toString(Integer.parseInt(auxequipo1[i][2])+1);
            if((disparos1>disparco1)&&(aux==1)&&(disparco1<10)){
                aux = 0;
                i =(int)(Math.round(Math.random()*9)+1);
                aux = (int)(Math.round(Math.random()*0.9)+0);
                disparco1 = disparco1 + aux;
                if(aux==1)
                    auxequipo1[i][3]=Integer.toString(Integer.parseInt(auxequipo1[i][3])+1);
                if((disparco1>atajada2)&&(aux==1)){
                    atajada2 = atajada2 + (int)(Math.round(Math.random()*1.3)+0);
                    if(auxata2<atajada2)
                        auxequipo2[0][9]=Integer.toString(Integer.parseInt(auxequipo2[0][9])+1);
                }
            }
            i =(int)(Math.round(Math.random()*9)+1);
            aux = (int)(Math.round(Math.random()*1)+0);
            disparos2 = disparos2 + aux;
            if(aux==1)
                auxequipo2[i][2]=Integer.toString(Integer.parseInt(auxequipo2[i][2])+1);
            if((disparos2>disparco2)&&(aux==1)&&(disparco2<10)){
                aux = 0;
                i =(int)(Math.round(Math.random()*9)+1);
                aux = (int)(Math.round(Math.random()*0.9)+0);
                disparco2 = disparco2 + aux;
                if(aux==1)
                    auxequipo2[i][3]=Integer.toString(Integer.parseInt(auxequipo2[i][3])+1);
                if((disparco2>atajada1)&&(aux==1)){
                    atajada1 = atajada1 + (int)(Math.round(Math.random()*1.3)+0);
                    if(auxata1<atajada1)
                        auxequipo1[0][9]=Integer.toString(Integer.parseInt(auxequipo1[0][9])+1);
                }
            }
        }
        goleada1 = disparco1-atajada2;
        goleada2 = disparco2-atajada1;
        if (auxgol1<goleada1){
            int j;
            int i =(int)(Math.round(Math.random()*9)+1);
            auxequipo1[i][4]=Integer.toString(Integer.parseInt(auxequipo1[i][4])+1);
            do{
                j =(int)(Math.round(Math.random()*9)+1);
            }while(j!=i);
            auxequipo1[j][5]=Integer.toString(Integer.parseInt(auxequipo1[j][5])+1);
        }
        if (auxgol2<goleada2){
            int j;
            int i =(int)(Math.round(Math.random()*9)+1);
            auxequipo2[i][4]=Integer.toString(Integer.parseInt(auxequipo2[i][4])+1);
            do{
                j =(int)(Math.round(Math.random()*9)+1);
            }while(j!=i);
            auxequipo2[j][5]=Integer.toString(Integer.parseInt(auxequipo2[j][5])+1);
        }
        posesion1 = ((posesion1+(int)(Math.round(Math.random()*40))+30)/2);
        posesion2 = 100 - posesion1;
        mostrartodo();
        redisenarequipo1(auxequipo1,auxsup1,auxeq1);
        redisenarequipo2(auxequipo2,auxsup2,auxeq2);
    } 
    
    public void mostraricono(int i){
        switch(i){
            case 5:
                if(auxama1<amarilla1)
                    ama1.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama2.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito1.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito2.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola1.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola2.setIcon(baloncito);
            break;
            case 10:
                if(auxama1<amarilla1)
                    ama3.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama4.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito3.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito4.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola3.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola4.setIcon(baloncito);
            break;
            case 15:
                if(auxama1<amarilla1)
                    ama5.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama6.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito5.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito6.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola5.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola6.setIcon(baloncito);
            break;
            case 20:
                if(auxama1<amarilla1)
                    ama7.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama8.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito7.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito8.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola7.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola8.setIcon(baloncito);
            break;
            case 25:
                if(auxama1<amarilla1)
                    ama9.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama10.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito9.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito10.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola9.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola10.setIcon(baloncito);
            break;
            case 30:
                if(auxama1<amarilla1)
                    ama11.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama12.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito11.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito12.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola11.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola12.setIcon(baloncito);
            break;
            case 35:
                if(auxama1<amarilla1)
                    ama13.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama14.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito13.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito14.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola13.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola14.setIcon(baloncito);
            break;
            case 40:
                if(auxama1<amarilla1)
                    ama15.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama16.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito15.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito16.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola15.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola16.setIcon(baloncito);
            break;
            case 45:
                if(auxama1<amarilla1)
                    ama17.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama18.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito17.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito18.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola17.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola18.setIcon(baloncito);
            break;
            case 50:
                if(auxama1<amarilla1)
                    ama19.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama20.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito19.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito20.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola19.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola20.setIcon(baloncito);
            break;
            case 55:
                if(auxama1<amarilla1)
                    ama21.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama22.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito21.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito22.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola21.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola22.setIcon(baloncito);
            break;
            case 60:
                if(auxama1<amarilla1)
                    ama23.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama24.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito23.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito24.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola23.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola24.setIcon(baloncito);
            break;
            case 65:
                if(auxama1<amarilla1)
                    ama25.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama26.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito25.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito26.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola25.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola26.setIcon(baloncito);
            break;
            case 70:
                if(auxama1<amarilla1)
                    ama27.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama28.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito27.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito28.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola27.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola28.setIcon(baloncito);
            break;
            case 75:
                if(auxama1<amarilla1)
                    ama29.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama30.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito29.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito30.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola29.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola30.setIcon(baloncito);
            break;
            case 80:
                if(auxama1<amarilla1)
                    ama31.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama32.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito31.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito32.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola31.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola32.setIcon(baloncito);
            break;
            case 85:
                if(auxama1<amarilla1)
                    ama33.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama34.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito33.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito34.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola33.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola34.setIcon(baloncito);
            break;
            case 90:
                if(auxama1<amarilla1)
                    ama35.setIcon(tarjetamarilla);
                if(auxama2<amarilla2)
                    ama36.setIcon(tarjetamarilla);
                if(auxroja1<roja1)
                    rojito35.setIcon(tarjetaroja);
                if(auxroja2<roja2)
                    rojito36.setIcon(tarjetaroja);
                if(auxgol1<goleada1)
                    bola35.setIcon(baloncito);
                if(auxgol2<goleada2)
                    bola36.setIcon(baloncito);
            break; 
            default:
            break;
        }
    }
       
    public final void borrargamecast(){
        ama1.setIcon(nula);
        ama2.setIcon(nula);
        ama3.setIcon(nula);
        ama4.setIcon(nula);
        ama5.setIcon(nula);
        ama6.setIcon(nula);
        ama7.setIcon(nula);
        ama8.setIcon(nula);
        ama9.setIcon(nula);
        ama10.setIcon(nula);
        ama11.setIcon(nula);
        ama12.setIcon(nula);
        ama13.setIcon(nula);
        ama14.setIcon(nula);
        ama15.setIcon(nula);
        ama16.setIcon(nula);
        ama17.setIcon(nula);
        ama18.setIcon(nula);
        ama19.setIcon(nula);
        ama20.setIcon(nula);
        ama21.setIcon(nula);
        ama22.setIcon(nula);
        ama23.setIcon(nula);
        ama24.setIcon(nula);
        ama25.setIcon(nula);
        ama26.setIcon(nula);
        ama27.setIcon(nula);
        ama28.setIcon(nula);
        ama29.setIcon(nula);
        ama30.setIcon(nula);
        ama31.setIcon(nula);
        ama32.setIcon(nula);
        ama33.setIcon(nula);
        ama34.setIcon(nula);
        ama35.setIcon(nula);
        ama36.setIcon(nula);
        rojito1.setIcon(nula);
        rojito2.setIcon(nula);
        rojito3.setIcon(nula);
        rojito4.setIcon(nula);
        rojito5.setIcon(nula);
        rojito6.setIcon(nula);
        rojito7.setIcon(nula);
        rojito8.setIcon(nula);
        rojito9.setIcon(nula);
        rojito10.setIcon(nula);
        rojito11.setIcon(nula);
        rojito12.setIcon(nula);
        rojito13.setIcon(nula);
        rojito14.setIcon(nula);
        rojito15.setIcon(nula);
        rojito16.setIcon(nula);
        rojito17.setIcon(nula);
        rojito18.setIcon(nula);
        rojito19.setIcon(nula);
        rojito20.setIcon(nula);
        rojito21.setIcon(nula);
        rojito22.setIcon(nula);
        rojito23.setIcon(nula);
        rojito24.setIcon(nula);
        rojito25.setIcon(nula);
        rojito26.setIcon(nula);
        rojito27.setIcon(nula);
        rojito28.setIcon(nula);
        rojito29.setIcon(nula);
        rojito30.setIcon(nula);
        rojito31.setIcon(nula);
        rojito32.setIcon(nula);
        rojito33.setIcon(nula);
        rojito34.setIcon(nula);
        rojito35.setIcon(nula);
        rojito36.setIcon(nula);
        bola1.setIcon(nula);
        bola2.setIcon(nula);
        bola3.setIcon(nula);
        bola4.setIcon(nula);
        bola5.setIcon(nula);
        bola6.setIcon(nula);
        bola7.setIcon(nula);
        bola8.setIcon(nula);
        bola9.setIcon(nula);
        bola10.setIcon(nula);
        bola11.setIcon(nula);
        bola12.setIcon(nula);
        bola13.setIcon(nula);
        bola14.setIcon(nula);
        bola15.setIcon(nula);
        bola16.setIcon(nula);
        bola17.setIcon(nula);
        bola18.setIcon(nula);
        bola19.setIcon(nula);
        bola20.setIcon(nula);
        bola21.setIcon(nula);
        bola22.setIcon(nula);
        bola23.setIcon(nula);
        bola24.setIcon(nula);
        bola25.setIcon(nula);
        bola26.setIcon(nula);
        bola27.setIcon(nula);
        bola28.setIcon(nula);
        bola29.setIcon(nula);
        bola30.setIcon(nula);
        bola31.setIcon(nula);
        bola32.setIcon(nula);
        bola33.setIcon(nula);
        bola34.setIcon(nula);
        bola35.setIcon(nula);
        bola36.setIcon(nula);
    }
    
    /***************************************************************************
     * Aqui esta dedicado a las tablas estadisticas de la siguiente manera:    *
     *                                                                         *
     * (reconocerequipo---->redisenarequipo---->redisenarestadisticasequpo)    *
     * reconocerequipo: metodo encargado de determinar cuales son los equipos  *
     * redisenarequipo: metodo encargado de refrescar las tablas estadisticas  *
     * redisenarestadisticas: metodo para dar formato a las tablas estadisticas*
     ***************************************************************************/
    
    public void reconocerequipo(String equipo1,String equipo2){

        if(equipo1.equals("Argentina"))
            redisenarequipo1(Argentinatitular,Argentinasuplentes,equipo1);
        if(equipo2.equals("Argentina"))
            redisenarequipo2(Argentinatitular,Argentinasuplentes,equipo2);
        if(equipo1.equals("Bolivia"))
            redisenarequipo1(Boliviatitular,Boliviasuplentes,equipo1);
        if(equipo2.equals("Bolivia"))
            redisenarequipo2(Boliviatitular,Boliviasuplentes,equipo2);
        if(equipo1.equals("Colombia"))
            redisenarequipo1(Colombiatitular,Colombiasuplentes,equipo1);
        if(equipo2.equals("Colombia"))
            redisenarequipo2(Colombiatitular,Colombiasuplentes,equipo2);
        if(equipo1.equals("Costa Rica"))
            redisenarequipo1(Costaricatitular,Costaricasuplentes,equipo1);
        if(equipo2.equals("Costa Rica"))
            redisenarequipo2(Costaricatitular,Costaricasuplentes,equipo2);
        if(equipo1.equals("Brasil"))
            redisenarequipo1(Brasiltitular,Brasilsuplentes,equipo1);
        if(equipo2.equals("Brasil"))
            redisenarequipo2(Brasiltitular,Brasilsuplentes,equipo2);
        if(equipo1.equals("Ecuador"))
            redisenarequipo1(Ecuadortitular,Ecuadorsuplentes,equipo1);
        if(equipo2.equals("Ecuador"))
            redisenarequipo2(Ecuadortitular,Ecuadorsuplentes,equipo2);
        if(equipo1.equals("Paraguay"))
            redisenarequipo1(Paraguaytitular,Paraguaysuplentes,equipo1);
        if(equipo2.equals("Paraguay"))
            redisenarequipo2(Paraguaytitular,Paraguaysuplentes,equipo2);
        if(equipo1.equals("Venezuela"))
            redisenarequipo1(Venezuelatitular,Venezuelasuplentes,equipo1);
        if(equipo2.equals("Venezuela"))
            redisenarequipo2(Venezuelatitular,Venezuelasuplentes,equipo2);
        if(equipo1.equals("Chile"))
            redisenarequipo1(Chiletitular,Chilesuplentes,equipo1);
        if(equipo2.equals("Chile"))
            redisenarequipo2(Chiletitular,Chilesuplentes,equipo2);
        if(equipo1.equals("Mexico"))
            redisenarequipo1(Mexicotitular,Mexicosuplentes,equipo1);
        if(equipo2.equals("Mexico"))
            redisenarequipo2(Mexicotitular,Mexicosuplentes,equipo2);
        if(equipo1.equals("Peru"))
            redisenarequipo1(Perutitular,Perusuplentes,equipo1);
        if(equipo2.equals("Peru"))
            redisenarequipo2(Perutitular,Perusuplentes,equipo2);
        if(equipo1.equals("Uruguay"))
            redisenarequipo1(Uruguaytitular,Uruguaysuplentes,equipo1);
        if(equipo2.equals("Uruguay"))
            redisenarequipo2(Uruguaytitular,Uruguaysuplentes,equipo2);
    }

    public final void redisenarestadisticasequipo1(){
        
        // Tamaño de columnas tabla de estadisticas equipo1 titular1
        titular1.getColumnModel().getColumn(0).setMinWidth(35);
        titular1.getColumnModel().getColumn(0).setMaxWidth(35);
        titular1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        titular1.getColumnModel().getColumn(1).setMinWidth(387);
        titular1.getColumnModel().getColumn(1).setMaxWidth(387);
        for (int i=2;i<12;i++){
        titular1.getColumnModel().getColumn(i).setCellRenderer(tcr); 
        // centra valores equipo1 titular1
        titular1.getColumnModel().getColumn(i).setMinWidth(50);
        titular1.getColumnModel().getColumn(i).setMaxWidth(50);
        }
        // Tamaño de columnas tabla de estadisticas equipo1 suplente1
        suplente1.getColumnModel().getColumn(0).setMinWidth(35);
        suplente1.getColumnModel().getColumn(0).setMaxWidth(35);
        suplente1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        suplente1.getColumnModel().getColumn(1).setMinWidth(387);
        suplente1.getColumnModel().getColumn(1).setMaxWidth(387);
        for (int i=2;i<12;i++){
        suplente1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        // centra valores equipo1 suplente1
        suplente1.getColumnModel().getColumn(i).setMinWidth(50);
        suplente1.getColumnModel().getColumn(i).setMaxWidth(50);
        }
    }     
    
    public final void redisenarestadisticasequipo2(){
        
        // Tamaño de columnas tabla de estadisticas equipo2 titular2
        titular2.getColumnModel().getColumn(0).setMinWidth(35);
        titular2.getColumnModel().getColumn(0).setMaxWidth(35);
        titular2.getColumnModel().getColumn(0).setCellRenderer(tcr); 
        titular2.getColumnModel().getColumn(1).setMinWidth(387);
        titular2.getColumnModel().getColumn(1).setMaxWidth(387);
        for (int i=2;i<12;i++){
        titular2.getColumnModel().getColumn(i).setCellRenderer(tcr); 
        // centra valores equipo2 titular2
        titular2.getColumnModel().getColumn(i).setMinWidth(50);
        titular2.getColumnModel().getColumn(i).setMaxWidth(50);
        }
        // Tamaño de columnas tabla de estadisticas equipo2 suplente2
        suplente2.getColumnModel().getColumn(0).setMinWidth(35);
        suplente2.getColumnModel().getColumn(0).setMaxWidth(35);
        suplente2.getColumnModel().getColumn(0).setCellRenderer(tcr);
        suplente2.getColumnModel().getColumn(1).setMinWidth(387);
        suplente2.getColumnModel().getColumn(1).setMaxWidth(387);
        for (int i=2;i<12;i++){
        suplente2.getColumnModel().getColumn(i).setCellRenderer(tcr); 
        // centra valores equipo2 sumplente2
        suplente2.getColumnModel().getColumn(i).setMinWidth(50);
        suplente2.getColumnModel().getColumn(i).setMaxWidth(50);
        }
    }

    public void redisenarequipo1(String [][] tit, String [][] sup, String equipo){

        titulares1 = new DefaultTableModel(tit,columestad){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        suplentes1 = new DefaultTableModel(sup,columestad){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        titular1.setModel(titulares1);
        suplente1.setModel(suplentes1);
        auxequipo1=tit;
        auxsup1=sup;
        auxeq1=equipo;
        redisenarestadisticasequipo1();
        estadisticasxequipo.setTitleAt(0,equipo);
    }
    
    public void redisenarequipo2(String [][] tit, String [][] sup, String equipo){
        
        titulares2 = new DefaultTableModel(tit,columestad){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        suplentes2 = new DefaultTableModel(sup,columestad){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        titular2.setModel(titulares2);
        suplente2.setModel(suplentes2);
        redisenarestadisticasequipo2();
        auxequipo2=tit;
        auxsup2=sup;
        auxeq2=equipo;
        estadisticasxequipo.setTitleAt(1,equipo);
    }
    
    public void borrarestadisticas(String [][] tit1, String [][] tit2){
        for(int i=0;i<11;i++){
            for(int j=2;j<12;j++){
                tit1[i][j]="0";
                tit2[i][j]="0";
            }
        }
    }
    
    /***************************************************************************
     * Aqui esta dedicado a las tablas de los grupos A,B y C:                  *
     *                                                                         *
     * redisenargrupo: Metodo dedicado a establecer formato de tablas          *
     * actualizargrupo: Metodo dedicado a actualizar valores de las tablas     *
     * generartercero: Metodo dedicado a escoger los dos mejores terceros      *
     ***************************************************************************/
    
    public final void redisenargrupoa(){
        grupoa.getColumnModel().getColumn(0).setMinWidth(127);
        grupoa.getColumnModel().getColumn(0).setMaxWidth(127);
        for (int i=1;i<8;i++){
            grupoa.getColumnModel().getColumn(i).setCellRenderer(tcr);
            // centra valores tabla grupo a
            grupoa.getColumnModel().getColumn(i).setMinWidth(35);
            grupoa.getColumnModel().getColumn(i).setMaxWidth(35);
            // Ancho minimo = ancho maximo --> ancho columna fijo
        }
        grupoa.getColumnModel().getColumn(8).setCellRenderer(tcr);
        grupoa.getColumnModel().getColumn(8).setMinWidth(45);
        grupoa.getColumnModel().getColumn(8).setMaxWidth(45);
    }
    
    public final void redisenargrupob(){
        grupob.getColumnModel().getColumn(0).setMinWidth(127);
        grupob.getColumnModel().getColumn(0).setMaxWidth(127);
        for (int i=1;i<8;i++){
            grupob.getColumnModel().getColumn(i).setCellRenderer(tcr);
            // centra valores tabla grupo a
            grupob.getColumnModel().getColumn(i).setMinWidth(35);
            grupob.getColumnModel().getColumn(i).setMaxWidth(35);
            // Ancho minimo = ancho maximo --> ancho columna fijo
        }
        grupob.getColumnModel().getColumn(8).setCellRenderer(tcr);
        grupob.getColumnModel().getColumn(8).setMinWidth(45);
        grupob.getColumnModel().getColumn(8).setMaxWidth(45);
    }
    
    public final void redisenargrupoc(){
        grupoc.getColumnModel().getColumn(0).setMinWidth(127);
        grupoc.getColumnModel().getColumn(0).setMaxWidth(127);
        for (int i=1;i<8;i++){
            grupoc.getColumnModel().getColumn(i).setCellRenderer(tcr);
            // centra valores tabla grupo a
            grupoc.getColumnModel().getColumn(i).setMinWidth(35);
            grupoc.getColumnModel().getColumn(i).setMaxWidth(35);
            // Ancho minimo = ancho maximo --> ancho columna fijo
        }
        grupoc.getColumnModel().getColumn(8).setCellRenderer(tcr);
        grupoc.getColumnModel().getColumn(8).setMinWidth(45);
        grupoc.getColumnModel().getColumn(8).setMaxWidth(45);
    }
    
    public void actualizargrupoa(int equipo1,int equipo2){
        String [] aux;
        int [] difgol={0,0,0,0};

        elgrupoa[equipo1][2]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][2]))+1);
        elgrupoa[equipo2][2]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][2]))+1);
        elgrupoa[equipo1][6]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][6]))+goleada1);
        elgrupoa[equipo2][6]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][6]))+goleada2);
        elgrupoa[equipo1][7]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][7]))+goleada2);
        elgrupoa[equipo2][7]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][7]))+goleada1);
        if(goleada1>goleada2){
            elgrupoa[equipo1][1]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][1]))+3);
            elgrupoa[equipo1][3]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][3]))+1);
            elgrupoa[equipo2][5]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][5]))+1);
        }
        else if(goleada2>goleada1){
            elgrupoa[equipo2][1]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][1]))+3);
            elgrupoa[equipo2][3]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][3]))+1);
            elgrupoa[equipo1][5]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][5]))+1);
        }
        else{
            elgrupoa[equipo1][1]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][1]))+1);
            elgrupoa[equipo2][1]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][1]))+1);
            elgrupoa[equipo1][4]=Integer.toString((Integer.parseInt(elgrupoa[equipo1][4]))+1);
            elgrupoa[equipo2][4]=Integer.toString((Integer.parseInt(elgrupoa[equipo2][4]))+1);
        }
        double x = ((Double.parseDouble(elgrupoa[equipo1][1]))/9)*100;               
        x = Math.rint(x*100)/100;
        double y = ((Double.parseDouble(elgrupoa[equipo2][1]))/9)*100;
        y = Math.rint(y*100)/100;               
        elgrupoa[equipo1][8]=Double.toString(x);
        elgrupoa[equipo2][8]=Double.toString(y);
        
        // burbuja para ordenar la tabla por puntos
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if(Integer.parseInt(elgrupoa[j][1])<Integer.parseInt(elgrupoa[j+1][1])){
                    aux = elgrupoa[j];
                    elgrupoa[j]=elgrupoa[j+1];
                    elgrupoa[j+1]=aux;
                }
            }
        }
        for(int i=0;i<4;i++){
            difgol[i]=Integer.parseInt(elgrupoa[i][6])-Integer.parseInt(elgrupoa[i][7]);            
        }
        // burbuja para ordenar la tabla por diferencia de goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupoa[j][1])==Integer.parseInt(elgrupoa[j+1][1]))&&(difgol[j]<difgol[j+1])){
                    aux = elgrupoa[j];
                    elgrupoa[j]=elgrupoa[j+1];
                    elgrupoa[j+1]=aux;                
                }
            }
        }
        // burbuja para ordenar la tabla por el que metio mas goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupoa[j][1])==Integer.parseInt(elgrupoa[j+1][1]))&&(difgol[j]==difgol[j+1])&&(Integer.parseInt(elgrupoa[j][6])<Integer.parseInt(elgrupoa[j+1][6]))){
                    aux = elgrupoa[j];
                    elgrupoa[j]=elgrupoa[j+1];
                    elgrupoa[j+1]=aux;                
                }
            }
        }
        modelo1 = new DefaultTableModel(elgrupoa,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        grupoa.setModel(modelo1);        
    }

    public void actualizargrupob(int equipo1,int equipo2){
        String [] aux;
        int [] difgol={0,0,0,0};

        elgrupob[equipo1][2]=Integer.toString((Integer.parseInt(elgrupob[equipo1][2]))+1);
        elgrupob[equipo2][2]=Integer.toString((Integer.parseInt(elgrupob[equipo2][2]))+1);
        elgrupob[equipo1][6]=Integer.toString((Integer.parseInt(elgrupob[equipo1][6]))+goleada1);
        elgrupob[equipo2][6]=Integer.toString((Integer.parseInt(elgrupob[equipo2][6]))+goleada2);
        elgrupob[equipo1][7]=Integer.toString((Integer.parseInt(elgrupob[equipo1][7]))+goleada2);
        elgrupob[equipo2][7]=Integer.toString((Integer.parseInt(elgrupob[equipo2][7]))+goleada1);
        if(goleada1>goleada2){
            elgrupob[equipo1][1]=Integer.toString((Integer.parseInt(elgrupob[equipo1][1]))+3);
            elgrupob[equipo1][3]=Integer.toString((Integer.parseInt(elgrupob[equipo1][3]))+1);
            elgrupob[equipo2][5]=Integer.toString((Integer.parseInt(elgrupob[equipo2][5]))+1);
        }
        else if(goleada2>goleada1){
            elgrupob[equipo2][1]=Integer.toString((Integer.parseInt(elgrupob[equipo2][1]))+3);
            elgrupob[equipo2][3]=Integer.toString((Integer.parseInt(elgrupob[equipo2][3]))+1);
            elgrupob[equipo1][5]=Integer.toString((Integer.parseInt(elgrupob[equipo1][5]))+1);
        }
        else{
            elgrupob[equipo1][1]=Integer.toString((Integer.parseInt(elgrupob[equipo1][1]))+1);
            elgrupob[equipo2][1]=Integer.toString((Integer.parseInt(elgrupob[equipo2][1]))+1);
            elgrupob[equipo1][4]=Integer.toString((Integer.parseInt(elgrupob[equipo1][4]))+1);
            elgrupob[equipo2][4]=Integer.toString((Integer.parseInt(elgrupob[equipo2][4]))+1);
        }
        double x = ((Double.parseDouble(elgrupob[equipo1][1]))/9)*100;               
        x = Math.rint(x*100)/100;
        double y = ((Double.parseDouble(elgrupob[equipo2][1]))/9)*100;
        y = Math.rint(y*100)/100;               
        elgrupob[equipo1][8]=Double.toString(x);
        elgrupob[equipo2][8]=Double.toString(y);
        // burbuja para ordenar la tabla por puntos
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if(Integer.parseInt(elgrupob[j][1])<Integer.parseInt(elgrupob[j+1][1])){
                    aux = elgrupob[j];
                    elgrupob[j]=elgrupob[j+1];
                    elgrupob[j+1]=aux;
                }
            }
        }
        for(int i=0;i<4;i++){
            difgol[i]=Integer.parseInt(elgrupob[i][6])-Integer.parseInt(elgrupob[i][7]);            
        }
        // burbuja para ordenar la tabla por diferencia de goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupob[j][1])==Integer.parseInt(elgrupob[j+1][1]))&&(difgol[j]<difgol[j+1])){
                    aux = elgrupob[j];
                    elgrupob[j]=elgrupob[j+1];
                    elgrupob[j+1]=aux;                
                }
            }
        }
        // burbuja para ordenar la tabla por el que metio mas goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupob[j][1])==Integer.parseInt(elgrupob[j+1][1]))&&(difgol[j]==difgol[j+1])&&(Integer.parseInt(elgrupob[j][6])<Integer.parseInt(elgrupob[j+1][6]))){
                    aux = elgrupob[j];
                    elgrupob[j]=elgrupob[j+1];
                    elgrupob[j+1]=aux;                
                }
            }
        }
        modelo1 = new DefaultTableModel(elgrupob,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        grupob.setModel(modelo1);        
    }

    public void actualizargrupoc(int equipo1,int equipo2){
        String [] aux;
        int [] difgol={0,0,0,0};

        elgrupoc[equipo1][2]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][2]))+1);
        elgrupoc[equipo2][2]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][2]))+1);
        elgrupoc[equipo1][6]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][6]))+goleada1);
        elgrupoc[equipo2][6]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][6]))+goleada2);
        elgrupoc[equipo1][7]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][7]))+goleada2);
        elgrupoc[equipo2][7]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][7]))+goleada1);
        if(goleada1>goleada2){
            elgrupoc[equipo1][1]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][1]))+3);
            elgrupoc[equipo1][3]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][3]))+1);
            elgrupoc[equipo2][5]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][5]))+1);
        }
        else if(goleada2>goleada1){
            elgrupoc[equipo2][1]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][1]))+3);
            elgrupoc[equipo2][3]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][3]))+1);
            elgrupoc[equipo1][5]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][5]))+1);
        }
        else{
            elgrupoc[equipo1][1]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][1]))+1);
            elgrupoc[equipo2][1]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][1]))+1);
            elgrupoc[equipo1][4]=Integer.toString((Integer.parseInt(elgrupoc[equipo1][4]))+1);
            elgrupoc[equipo2][4]=Integer.toString((Integer.parseInt(elgrupoc[equipo2][4]))+1);
        }
        double x = ((Double.parseDouble(elgrupoc[equipo1][1]))/9)*100;               
        x = Math.rint(x*100)/100;
        double y = ((Double.parseDouble(elgrupoc[equipo2][1]))/9)*100;
        y = Math.rint(y*100)/100;               
        elgrupoc[equipo1][8]=Double.toString(x);
        elgrupoc[equipo2][8]=Double.toString(y);
        // burbuja para ordenar la tabla por puntos
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if(Integer.parseInt(elgrupoc[j][1])<Integer.parseInt(elgrupoc[j+1][1])){
                    aux = elgrupoc[j];
                    elgrupoc[j]=elgrupoc[j+1];
                    elgrupoc[j+1]=aux;
                }
            }
        }
        for(int i=0;i<4;i++){
            difgol[i]=Integer.parseInt(elgrupoc[i][6])-Integer.parseInt(elgrupoc[i][7]);            
        }
        // burbuja para ordenar la tabla por diferencia de goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupoc[j][1])==Integer.parseInt(elgrupoc[j+1][1]))&&(difgol[j]<difgol[j+1])){
                    aux = elgrupoc[j];
                    elgrupoc[j]=elgrupoc[j+1];
                    elgrupoc[j+1]=aux;                
                }
            }
        }
        // burbuja para ordenar la tabla por el que metio mas goles
        for(int i=1;i<4;i++){
            for(int j=0;j<(4-i);j++){
                if((Integer.parseInt(elgrupoc[j][1])==Integer.parseInt(elgrupoc[j+1][1]))&&(difgol[j]==difgol[j+1])&&(Integer.parseInt(elgrupoc[j][6])<Integer.parseInt(elgrupoc[j+1][6]))){
                    aux = elgrupoc[j];
                    elgrupoc[j]=elgrupoc[j+1];
                    elgrupoc[j+1]=aux;                
                }
            }
        }
        modelo1 = new DefaultTableModel(elgrupoc,coltab){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        grupoc.setModel(modelo1);        
    }
    
    public void generarterceros(){
        terceros[0]=elgrupoa[2];
        terceros[1]=elgrupob[2];
        terceros[2]=elgrupoc[2];
        
        String [] aux;
        int [] difgol={0,0,0,0};
        // burbuja para ordenar la tabla por puntos
        for(int i=1;i<3;i++){
            for(int j=0;j<(3-i);j++){
                if(Integer.parseInt(terceros[j][1])<Integer.parseInt(terceros[j+1][1])){
                    aux = terceros[j];
                    terceros[j]=terceros[j+1];
                    terceros[j+1]=aux;
                }
            }
        }
        for(int i=0;i<3;i++){
            difgol[i]=Integer.parseInt(terceros[i][6])-Integer.parseInt(terceros[i][7]);            
        }
        // burbuja para ordenar la tabla por diferencia de goles
        for(int i=1;i<3;i++){
            for(int j=0;j<(3-i);j++){
                if((Integer.parseInt(terceros[j][1])==Integer.parseInt(terceros[j+1][1]))&&(difgol[j]<difgol[j+1])){
                    aux = terceros[j];
                    terceros[j]=terceros[j+1];
                    terceros[j+1]=aux;                
                }
            }
        }
        // burbuja para ordenar la tabla por el que metio mas goles
        for(int i=1;i<3;i++){
            for(int j=0;j<(3-i);j++){
                if((Integer.parseInt(terceros[j][1])==Integer.parseInt(terceros[j+1][1]))&&(difgol[j]==difgol[j+1])&&(Integer.parseInt(terceros[j][6])<Integer.parseInt(terceros[j+1][6]))){
                    aux = terceros[j];
                    terceros[j]=terceros[j+1];
                    terceros[j+1]=aux;                
                }
            }
        }
    }
    /* Asigna los equipos de los grupos A,B y C que clasifican a cuartos de    *
     * final a sus etiquetas respectivas                                       */
    
    public void cuartosdefinal(){
        
        cuartos1.setText(elgrupoa[0][0]);
        if(elgrupoa[0][0].equals("Argentina"))
            cuartos1.setIcon(banderaargentina);
        if(elgrupoa[0][0].equals("Bolivia"))
            cuartos1.setIcon(banderabolivia);
        if(elgrupoa[0][0].equals("Colombia"))
            cuartos1.setIcon(banderacolombia);
        if(elgrupoa[0][0].equals("Costa Rica"))
            cuartos1.setIcon(banderacostarica);
        
        cuartos2.setText(terceros[0][0]);
        if(terceros[0][0].equals("Argentina"))
            cuartos2.setIcon(banderaargentina);
        if(terceros[0][0].equals("Bolivia"))
            cuartos2.setIcon(banderabolivia);
        if(terceros[0][0].equals("Colombia"))
            cuartos2.setIcon(banderacolombia);
        if(terceros[0][0].equals("Costa Rica"))
            cuartos2.setIcon(banderacostarica);
        if(terceros[0][0].equals("Brasil"))
            cuartos2.setIcon(banderabrasil);
        if(terceros[0][0].equals("Ecuador"))
            cuartos2.setIcon(banderaecuador);
        if(terceros[0][0].equals("Paraguay"))
            cuartos2.setIcon(banderaparaguay);
        if(terceros[0][0].equals("Venezuela"))
            cuartos2.setIcon(banderavenezuela);
        if(terceros[0][0].equals("Chile"))
            cuartos2.setIcon(banderachile);
        if(terceros[0][0].equals("Mexico"))
            cuartos2.setIcon(banderamexico);
        if(terceros[0][0].equals("Peru"))
            cuartos2.setIcon(banderaperu);
        if(terceros[0][0].equals("Uruguay"))
            cuartos2.setIcon(banderauruguay);
        
        cuartos3.setText(elgrupoa[1][0]);
        if(elgrupoa[1][0].equals("Argentina"))
            cuartos3.setIcon(banderaargentina);
        if(elgrupoa[1][0].equals("Bolivia"))
            cuartos3.setIcon(banderabolivia);
        if(elgrupoa[1][0].equals("Colombia"))
            cuartos3.setIcon(banderacolombia);
        if(elgrupoa[1][0].equals("Costa Rica"))
            cuartos3.setIcon(banderacostarica);
        
        cuartos4.setText(elgrupoc[1][0]);
        if(elgrupoc[1][0].equals("Chile"))
            cuartos4.setIcon(banderachile);
        if(elgrupoc[1][0].equals("Mexico"))
            cuartos4.setIcon(banderamexico);
        if(elgrupoc[1][0].equals("Peru"))
            cuartos4.setIcon(banderaperu);
        if(elgrupoc[1][0].equals("Uruguay"))
            cuartos4.setIcon(banderauruguay);
        
        cuartos5.setText(elgrupob[0][0]);
        if(elgrupob[0][0].equals("Brasil"))
            cuartos5.setIcon(banderabrasil);
        if(elgrupob[0][0].equals("Ecuador"))
            cuartos5.setIcon(banderaecuador);
        if(elgrupob[0][0].equals("Paraguay"))
            cuartos5.setIcon(banderaparaguay);
        if(elgrupob[0][0].equals("Venezuela"))
            cuartos5.setIcon(banderavenezuela);
        
        cuartos6.setText(terceros[1][0]);
        if(terceros[1][0].equals("Argentina"))
            cuartos6.setIcon(banderaargentina);
        if(terceros[1][0].equals("Bolivia"))
            cuartos6.setIcon(banderabolivia);
        if(terceros[1][0].equals("Colombia"))
            cuartos6.setIcon(banderacolombia);
        if(terceros[1][0].equals("Costa Rica"))
            cuartos6.setIcon(banderacostarica);
        if(terceros[1][0].equals("Brasil"))
            cuartos6.setIcon(banderabrasil);
        if(terceros[1][0].equals("Ecuador"))
            cuartos6.setIcon(banderaecuador);
        if(terceros[1][0].equals("Paraguay"))
            cuartos6.setIcon(banderaparaguay);
        if(terceros[1][0].equals("Venezuela"))
            cuartos6.setIcon(banderavenezuela);
        if(terceros[1][0].equals("Chile"))
            cuartos6.setIcon(banderachile);
        if(terceros[1][0].equals("Mexico"))
            cuartos6.setIcon(banderamexico);
        if(terceros[1][0].equals("Peru"))
            cuartos6.setIcon(banderaperu);
        if(terceros[1][0].equals("Uruguay"))
            cuartos6.setIcon(banderauruguay);
        
        cuartos7.setText(elgrupoc[0][0]);
        if(elgrupoc[0][0].equals("Chile"))
            cuartos7.setIcon(banderachile);
        if(elgrupoc[0][0].equals("Mexico"))
            cuartos7.setIcon(banderamexico);
        if(elgrupoc[0][0].equals("Peru"))
            cuartos7.setIcon(banderaperu);
        if(elgrupoc[0][0].equals("Uruguay"))
            cuartos7.setIcon(banderauruguay);
        
        cuartos8.setText(elgrupob[1][0]);
        if(elgrupob[1][0].equals("Brasil"))
            cuartos8.setIcon(banderabrasil);
        if(elgrupob[1][0].equals("Ecuador"))
            cuartos8.setIcon(banderaecuador);
        if(elgrupob[1][0].equals("Paraguay"))
            cuartos8.setIcon(banderaparaguay);
        if(elgrupob[1][0].equals("Venezuela"))
            cuartos8.setIcon(banderavenezuela);
        
        qf1.setText(elgrupoa[0][0]);
        qf2.setText(terceros[0][0]);
        qf3.setText(elgrupoa[1][0]);
        qf4.setText(elgrupoc[1][0]);
        qf5.setText(elgrupob[0][0]);
        qf6.setText(terceros[1][0]);
        qf7.setText(elgrupoc[0][0]);
        qf8.setText(elgrupob[1][0]);
    }
    // Acciones de los 26 botones Play y los botones Empezar, Terminar y Penalty
    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        hilo = new Hilo(tiempo);
        hilo.start();
        empezar.setEnabled(false);
    }//GEN-LAST:event_empezarActionPerformed

    private void play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play1ActionPerformed
        borrartodo();
        opcion=1;
        equipoa1.setText("Argentina");
        equipoa2.setText("Argentina");
        equipoa3.setText("Argentina");
        equipob1.setText("Bolivia");
        equipob2.setText("Bolivia");
        equipob3.setText("Bolivia");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Argentina","Bolivia");
        empezar.setEnabled(true);
        play1.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play1ActionPerformed

    private void play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play2ActionPerformed
        borrartodo();
        opcion=2;
        equipoa1.setText("Colombia");
        equipoa2.setText("Colombia");
        equipoa3.setText("Colombia");
        equipob1.setText("Costa Rica");
        equipob2.setText("Costa Rica");
        equipob3.setText("Costa Rica");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Colombia","Costa Rica");
        empezar.setEnabled(true);
        play2.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play2ActionPerformed

    private void play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play3ActionPerformed
        borrartodo();        
        opcion=3;
        equipoa1.setText("Brasil");
        equipoa2.setText("Brasil");
        equipoa3.setText("Brasil");
        equipob1.setText("Venezuela");
        equipob2.setText("Venezuela");
        equipob3.setText("Venezuela");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Brasil","Venezuela");
        empezar.setEnabled(true);
        play3.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play3ActionPerformed

    private void play4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play4ActionPerformed
        borrartodo();        
        opcion=4;
        equipoa1.setText("Paraguay");
        equipoa2.setText("Paraguay");
        equipoa3.setText("Paraguay");
        equipob1.setText("Ecuador");
        equipob2.setText("Ecuador");
        equipob3.setText("Ecuador");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Paraguay","Ecuador");
        empezar.setEnabled(true);
        play4.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play4ActionPerformed

    private void play5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play5ActionPerformed
        borrartodo();        
        opcion=5;
        equipoa1.setText("Uruguay");
        equipoa2.setText("Uruguay");
        equipoa3.setText("Uruguay");
        equipob1.setText("Peru");
        equipob2.setText("Peru");
        equipob3.setText("Peru");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Uruguay","Peru");
        empezar.setEnabled(true);
        play5.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play5ActionPerformed

    private void play6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play6ActionPerformed
        borrartodo();        
        opcion=6;
        equipoa1.setText("Chile");
        equipoa2.setText("Chile");
        equipoa3.setText("Chile");
        equipob1.setText("Mexico");
        equipob2.setText("Mexico");
        equipob3.setText("Mexico");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Chile","Mexico");
        empezar.setEnabled(true);
        play6.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play6ActionPerformed

    private void play7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play7ActionPerformed
        borrartodo();        
        opcion=7;
        equipoa1.setText("Argentina");
        equipoa2.setText("Argentina");
        equipoa3.setText("Argentina");
        equipob1.setText("Colombia");
        equipob2.setText("Colombia");
        equipob3.setText("Colombia");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Argentina","Colombia");
        empezar.setEnabled(true);
        play7.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play7ActionPerformed

    private void play8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play8ActionPerformed
        borrartodo();        
        opcion=8;
        equipoa1.setText("Bolivia");
        equipoa2.setText("Bolivia");
        equipoa3.setText("Bolivia");
        equipob1.setText("Costa Rica");
        equipob2.setText("Costa Rica");
        equipob3.setText("Costa Rica");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Bolivia","Costa Rica");
        empezar.setEnabled(true);
        play8.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play8ActionPerformed

    private void play9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play9ActionPerformed
        borrartodo();        
        opcion=9;
        equipoa1.setText("Uruguay");
        equipoa2.setText("Uruguay");
        equipoa3.setText("Uruguay");
        equipob1.setText("Chile");
        equipob2.setText("Chile");
        equipob3.setText("Chile");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Uruguay","Chile");
        empezar.setEnabled(true);
        play9.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play9ActionPerformed

    private void play10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play10ActionPerformed
        borrartodo();        
        opcion=10;
        equipoa1.setText("Peru");
        equipoa2.setText("Peru");
        equipoa3.setText("Peru");
        equipob1.setText("Mexico");
        equipob2.setText("Mexico");
        equipob3.setText("Mexico");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Peru","Mexico");
        empezar.setEnabled(true);
        play10.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play10ActionPerformed

    private void play11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play11ActionPerformed
        borrartodo();        
        opcion=11;
        equipoa1.setText("Brasil");
        equipoa2.setText("Brasil");
        equipoa3.setText("Brasil");
        equipob1.setText("Paraguay");
        equipob2.setText("Paraguay");
        equipob3.setText("Paraguay");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Brasil","Paraguay");
        empezar.setEnabled(true);
        play11.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play11ActionPerformed

    private void play12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play12ActionPerformed
        borrartodo();        
        opcion=12;
        equipoa1.setText("Venezuela");
        equipoa2.setText("Venezuela");
        equipoa3.setText("Venezuela");
        equipob1.setText("Ecuador");
        equipob2.setText("Ecuador");
        equipob3.setText("Ecuador");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Venezuela","Ecuador");
        empezar.setEnabled(true);
        play12.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play12ActionPerformed

    private void play13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play13ActionPerformed
        borrartodo();        
        opcion=13;
        equipoa1.setText("Colombia");
        equipoa2.setText("Colombia");
        equipoa3.setText("Colombia");
        equipob1.setText("Bolivia");
        equipob2.setText("Bolivia");
        equipob3.setText("Bolivia");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Colombia","Bolivia");
        empezar.setEnabled(true);
        play13.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        fechas.setSelectedIndex(1);
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play13ActionPerformed

    private void play14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play14ActionPerformed
        borrartodo();        
        opcion=14;
        equipoa1.setText("Argentina");
        equipoa2.setText("Argentina");
        equipoa3.setText("Argentina");
        equipob1.setText("Costa Rica");
        equipob2.setText("Costa Rica");
        equipob3.setText("Costa Rica");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Argentina","Costa Rica");
        empezar.setEnabled(true);
        play14.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play14ActionPerformed

    private void play15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play15ActionPerformed
        borrartodo();        
        opcion=15;
        equipoa1.setText("Chile");
        equipoa2.setText("Chile");
        equipoa3.setText("Chile");
        equipob1.setText("Peru");
        equipob2.setText("Peru");
        equipob3.setText("Peru");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Chile","Peru");
        empezar.setEnabled(true);
        play15.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play15ActionPerformed

    private void play16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play16ActionPerformed
        borrartodo();        
        opcion=16;
        equipoa1.setText("Uruguay");
        equipoa2.setText("Uruguay");
        equipoa3.setText("Uruguay");
        equipob1.setText("Mexico");
        equipob2.setText("Mexico");
        equipob3.setText("Mexico");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Uruguay","Mexico");
        empezar.setEnabled(true);
        play16.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play16ActionPerformed

    private void play17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play17ActionPerformed
        borrartodo();        
        opcion=17;
        equipoa1.setText("Paraguay");
        equipoa2.setText("Paraguay");
        equipoa3.setText("Paraguay");
        equipob1.setText("Venezuela");
        equipob2.setText("Venezuela");
        equipob3.setText("Venezuela");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Paraguay","Venezuela");
        empezar.setEnabled(true);
        play17.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play17ActionPerformed

    private void play18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play18ActionPerformed
        borrartodo();        
        opcion=18;
        equipoa1.setText("Brasil");
        equipoa2.setText("Brasil");
        equipoa3.setText("Brasil");
        equipob1.setText("Ecuador");
        equipob2.setText("Ecuador");
        equipob3.setText("Ecuador");
        // coloca nombre de equipos en gamecast
        reconocerequipo("Brasil","Ecuador");
        empezar.setEnabled(true);
        play18.setEnabled(false);
        // deshabilita boton play y habilita empezar juego
        interfaz.setSelectedIndex(3);
    }//GEN-LAST:event_play18ActionPerformed

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        hilo=null;
        int equipo1 = 0;
        int equipo2 = 0;
        switch(opcion){
            case 1:
                ra1.setText(Integer.toString(goleada1));
                ra2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Argentina".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Bolivia".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();    
                play2.setEnabled(true);
                break;
            case 2:
                rb1.setText(Integer.toString(goleada1));
                rb2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Colombia".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Costa Rica".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();
                play3.setEnabled(true);
                break;
            case 3:
                rc1.setText(Integer.toString(goleada1));
                rc2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Brasil".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Venezuela".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob();
                play4.setEnabled(true);
                break;
            case 4:
                rd1.setText(Integer.toString(goleada1));
                rd2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Paraguay".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Ecuador".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob();
                play5.setEnabled(true);
                break;
            case 5:
                re1.setText(Integer.toString(goleada1));
                re2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Uruguay".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Peru".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play6.setEnabled(true);
                break;
            case 6:
                rf1.setText(Integer.toString(goleada1));
                rf2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Chile".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Mexico".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play7.setEnabled(true);
                break;
            case 7:
                rg1.setText(Integer.toString(goleada1));
                rg2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Argentina".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Colombia".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();
                play8.setEnabled(true);
                break;
            case 8:
                rh1.setText(Integer.toString(goleada1));
                rh2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Bolivia".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Costa Rica".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();
                play9.setEnabled(true);
                break;
            case 9:
                ri1.setText(Integer.toString(goleada1));
                ri2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Uruguay".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Chile".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play10.setEnabled(true);
                break;
            case 10:
                rj1.setText(Integer.toString(goleada1));
                rj2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Peru".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Mexico".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play11.setEnabled(true);
                break;
            case 11:
                rk1.setText(Integer.toString(goleada1));
                rk2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Brasil".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Paraguay".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob();
                play12.setEnabled(true);
                break;
            case 12:
                rl1.setText(Integer.toString(goleada1));
                rl2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Venezuela".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Ecuador".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob();                
                play13.setEnabled(true);
                break;
            case 13:
                rm1.setText(Integer.toString(goleada1));
                rm2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Colombia".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Bolivia".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();
                play14.setEnabled(true);
                break;
            case 14:
                rn1.setText(Integer.toString(goleada1));
                rn2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Argentina".equals(elgrupoa[i][0]))
                        equipo1=i;
                    if("Costa Rica".equals(elgrupoa[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoa(equipo1,equipo2);
                redisenargrupoa();
                play15.setEnabled(true);
                break;
            case 15:
                ro1.setText(Integer.toString(goleada1));
                ro2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Chile".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Peru".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play16.setEnabled(true);
                break;
            case 16:
                rp1.setText(Integer.toString(goleada1));
                rp2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Uruguay".equals(elgrupoc[i][0]))
                        equipo1=i;
                    if("Mexico".equals(elgrupoc[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupoc(equipo1,equipo2);
                redisenargrupoc();
                play17.setEnabled(true);
                break;
            case 17:
                rq1.setText(Integer.toString(goleada1));
                rq2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Paraguay".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Venezuela".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob(); 
                play18.setEnabled(true);
                break;
            case 18:
                rr1.setText(Integer.toString(goleada1));
                rr2.setText(Integer.toString(goleada2));
                for(int i=0;i<4;i++){
                    if("Brasil".equals(elgrupob[i][0]))
                        equipo1=i;
                    if("Ecuador".equals(elgrupob[i][0]))
                        equipo2=i;
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                actualizargrupob(equipo1,equipo2);
                redisenargrupob();
                generarterceros();
                cuartosdefinal();
                play19.setEnabled(true);
                break;
            case 19:
                if(penal==0){
                    rs1.setText(Integer.toString(goleada1));
                    rs2.setText(Integer.toString(goleada2));
                    qfre1.setText(Integer.toString(goleada1));
                    qfre2.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        sf1.setText(cuartos1.getText());
                        semis1.setText(cuartos1.getText());
                        semis1.setIcon(cuartos1.getIcon());
                    }
                    else{
                        sf1.setText(cuartos2.getText());
                        semis1.setText(cuartos2.getText());
                        semis1.setIcon(cuartos2.getIcon());
                    }
                }
                else{
                    rs1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rs2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    qfre1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    qfre2.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        sf1.setText(cuartos1.getText());
                        semis1.setText(cuartos1.getText());
                        semis1.setIcon(cuartos1.getIcon());
                    }
                    else{
                        sf1.setText(cuartos2.getText());
                        semis1.setText(cuartos2.getText());
                        semis1.setIcon(cuartos2.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play20.setEnabled(true);
            break;
            case 20:
                if(penal==0){
                    rt1.setText(Integer.toString(goleada1));
                    rt2.setText(Integer.toString(goleada2));
                    qfre3.setText(Integer.toString(goleada1));
                    qfre4.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        sf2.setText(cuartos3.getText());
                        semis2.setText(cuartos3.getText());
                        semis2.setIcon(cuartos3.getIcon());
                    }
                    else{
                        sf2.setText(cuartos4.getText());
                        semis2.setText(cuartos4.getText());
                        semis2.setIcon(cuartos4.getIcon());
                    }
                }
                else{
                    rt1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rt2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    qfre3.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    qfre4.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        sf2.setText(cuartos3.getText());
                        semis2.setText(cuartos3.getText());
                        semis2.setIcon(cuartos3.getIcon());
                    }
                    else{
                        sf2.setText(cuartos4.getText());
                        semis2.setText(cuartos4.getText());
                        semis2.setIcon(cuartos4.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play21.setEnabled(true);
            break;
            case 21:
                if(penal==0){
                    ru1.setText(Integer.toString(goleada1));
                    ru2.setText(Integer.toString(goleada2));
                    qfre5.setText(Integer.toString(goleada1));
                    qfre6.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        sf3.setText(cuartos5.getText());
                        semis3.setText(cuartos5.getText());
                        semis3.setIcon(cuartos5.getIcon());
                    }
                    else{
                        sf3.setText(cuartos6.getText());
                        semis3.setText(cuartos6.getText());
                        semis3.setIcon(cuartos6.getIcon());
                    }
                }
                else{
                    ru1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    ru2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    qfre5.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    qfre6.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        sf3.setText(cuartos5.getText());
                        semis3.setText(cuartos5.getText());
                        semis3.setIcon(cuartos5.getIcon());
                    }
                    else{
                        sf3.setText(cuartos6.getText());
                        semis3.setText(cuartos6.getText());
                        semis3.setIcon(cuartos6.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play22.setEnabled(true);                
            break;
            case 22:
                if(penal==0){
                    rv1.setText(Integer.toString(goleada1));
                    rv2.setText(Integer.toString(goleada2));
                    qfre7.setText(Integer.toString(goleada1));
                    qfre8.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        sf4.setText(cuartos7.getText());
                        semis4.setText(cuartos7.getText());
                        semis4.setIcon(cuartos7.getIcon());
                    }
                    else{
                        sf4.setText(cuartos8.getText());
                        semis4.setText(cuartos8.getText());
                        semis4.setIcon(cuartos8.getIcon());
                    }
                }
                else{
                    rv1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rv2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    qfre7.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    qfre8.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        sf4.setText(cuartos7.getText());
                        semis4.setText(cuartos7.getText());
                        semis4.setIcon(cuartos7.getIcon());
                    }
                    else{
                        sf4.setText(cuartos8.getText());
                        semis4.setText(cuartos8.getText());
                        semis4.setIcon(cuartos8.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play23.setEnabled(true);      
            break;
            case 23:
                if(penal==0){
                    rw1.setText(Integer.toString(goleada1));
                    rw2.setText(Integer.toString(goleada2));
                    sfre1.setText(Integer.toString(goleada1));
                    sfre2.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        f1.setText(semis1.getText());
                        granfinal1.setText(semis1.getText());
                        granfinal1.setIcon(semis1.getIcon());
                        tq1.setText(semis2.getText());
                        perdedores1.setText(semis2.getText());
                        perdedores1.setIcon(semis2.getIcon());
                    }
                    else{
                        f1.setText(semis2.getText());
                        granfinal1.setText(semis2.getText());
                        granfinal1.setIcon(semis2.getIcon());
                        tq1.setText(semis1.getText());
                        perdedores1.setText(semis1.getText());
                        perdedores1.setIcon(semis1.getIcon());
                    }
                }
                else{
                    rw1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rw2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    sfre1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    sfre2.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        f1.setText(semis1.getText());
                        granfinal1.setText(semis1.getText());
                        granfinal1.setIcon(semis1.getIcon());
                        tq1.setText(semis2.getText());
                        perdedores1.setText(semis2.getText());
                        perdedores1.setIcon(semis2.getIcon());
                    }
                    else{
                        f1.setText(semis2.getText());
                        granfinal1.setText(semis2.getText());
                        granfinal1.setIcon(semis2.getIcon());
                        tq1.setText(semis1.getText());
                        perdedores1.setText(semis1.getText());
                        perdedores1.setIcon(semis1.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play24.setEnabled(true);                
            break;
            case 24:
                if(penal==0){
                    rx1.setText(Integer.toString(goleada1));
                    rx2.setText(Integer.toString(goleada2));
                    sfre3.setText(Integer.toString(goleada1));
                    sfre4.setText(Integer.toString(goleada2));
                    if(goleada1>goleada2){
                        f2.setText(semis3.getText());
                        granfinal2.setText(semis3.getText());
                        granfinal2.setIcon(semis3.getIcon());
                        tq2.setText(semis4.getText());
                        perdedores2.setText(semis4.getText());
                        perdedores2.setIcon(semis4.getIcon());
                    }
                    else{
                        f2.setText(semis4.getText());
                        granfinal2.setText(semis4.getText());
                        granfinal2.setIcon(semis4.getIcon());
                        tq2.setText(semis3.getText());
                        perdedores2.setText(semis3.getText());
                        perdedores2.setIcon(semis3.getIcon());
                    }
                }
                else{
                    rx1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rx2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    sfre3.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    sfre4.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if(penales1>penales2){
                        f2.setText(semis3.getText());
                        granfinal2.setText(semis3.getText());
                        granfinal2.setIcon(semis3.getIcon());
                        tq2.setText(semis4.getText());
                        perdedores2.setText(semis4.getText());
                        perdedores2.setIcon(semis4.getIcon());
                    }
                    else{
                        f2.setText(semis4.getText());
                        granfinal2.setText(semis4.getText());
                        granfinal2.setIcon(semis4.getIcon());
                        tq2.setText(semis3.getText());
                        perdedores2.setText(semis3.getText());
                        perdedores2.setIcon(semis3.getIcon());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play25.setEnabled(true);                
            break;
            case 25:
                if(penal==0){
                    ry1.setText(Integer.toString(goleada1));
                    ry2.setText(Integer.toString(goleada2));
                    tqre1.setText(Integer.toString(goleada1));
                    tqre2.setText(Integer.toString(goleada2));
                    if (goleada1>goleada2){
                        tercer.setText(tq1.getText());
                        cuarto.setText(tq2.getText());
                        bandtercercuarto(tq1.getText(),tq2.getText());
                    }
                    else{
                        tercer.setText(tq2.getText());
                        cuarto.setText(tq1.getText());
                        bandtercercuarto(tq2.getText(),tq1.getText());
                    }
                }
                else{
                    ry1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    ry2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    tqre1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    tqre2.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if (penales1>penales2){
                        tercer.setText(tq1.getText());
                        cuarto.setText(tq2.getText());
                        bandtercercuarto(tq1.getText(),tq2.getText());
                    }
                    else{
                        tercer.setText(tq2.getText());
                        cuarto.setText(tq1.getText());
                        bandtercercuarto(tq2.getText(),tq1.getText());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
                play26.setEnabled(true);                
            break;
            case 26:
                if(penal==0){
                    rz1.setText(Integer.toString(goleada1));
                    rz2.setText(Integer.toString(goleada2));
                    fre1.setText(Integer.toString(goleada1));
                    fre2.setText(Integer.toString(goleada2));
                    if (goleada1>goleada2){
                        campeon.setText(f1.getText());
                        subcampeon.setText(f2.getText());
                        bandprimersegun(f1.getText(),f2.getText());
                    }
                    else{
                        campeon.setText(f2.getText());
                        subcampeon.setText(f1.getText());
                        bandprimersegun(f2.getText(),f1.getText());
                    }
                }
                else{
                    rz1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    rz2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
                    fre1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
                    fre2.setText(Integer.toString(goleada2)+"("+Integer.toString(penales2)+")");
                    if (penales1>penales2){
                        campeon.setText(f1.getText());
                        subcampeon.setText(f2.getText());
                        bandprimersegun(f1.getText(),f2.getText());
                    }
                    else{
                        campeon.setText(f2.getText());
                        subcampeon.setText(f1.getText());
                        bandprimersegun(f2.getText(),f1.getText());
                    }
                }
                borrarestadisticas(auxequipo1,auxequipo2);
            break;
        }
        interfaz.setSelectedIndex(0);
        terminar.setEnabled(false);
    }//GEN-LAST:event_terminarActionPerformed

private void play19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play19ActionPerformed
    borrartodo();        
    opcion=19;
    equipoa1.setText(elgrupoa[0][0]);
    equipoa2.setText(elgrupoa[0][0]);
    equipoa3.setText(elgrupoa[0][0]);
    equipob1.setText(terceros[0][0]);
    equipob2.setText(terceros[0][0]);
    equipob3.setText(terceros[0][0]);
    reconocerequipo(elgrupoa[0][0],terceros[0][0]);
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play19.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play19ActionPerformed

private void play20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play20ActionPerformed
    borrartodo();        
    opcion=20;
    equipoa1.setText(elgrupoa[1][0]);
    equipoa2.setText(elgrupoa[1][0]);
    equipoa3.setText(elgrupoa[1][0]);
    equipob1.setText(elgrupoc[1][0]);
    equipob2.setText(elgrupoc[1][0]);
    equipob3.setText(elgrupoc[1][0]);
    reconocerequipo(elgrupoa[1][0],elgrupoc[1][0]);
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play20.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play20ActionPerformed

private void play21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play21ActionPerformed
    borrartodo();        
    opcion=21;
    equipoa1.setText(elgrupob[0][0]);
    equipoa2.setText(elgrupob[0][0]);
    equipoa3.setText(elgrupob[0][0]);
    equipob1.setText(terceros[1][0]);
    equipob2.setText(terceros[1][0]);
    equipob3.setText(terceros[1][0]);
    reconocerequipo(elgrupob[0][0],terceros[1][0]);
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play21.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play21ActionPerformed

private void play22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play22ActionPerformed
    borrartodo();        
    opcion=22;
    equipoa1.setText(elgrupoc[0][0]);
    equipoa2.setText(elgrupoc[0][0]);
    equipoa3.setText(elgrupoc[0][0]);
    equipob1.setText(elgrupob[1][0]);
    equipob2.setText(elgrupob[1][0]);
    equipob3.setText(elgrupob[1][0]);
    reconocerequipo(elgrupoc[0][0],elgrupob[1][0]);
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play22.setEnabled(false);
    // deshabilita boton play y habilita empezar juego  
    fechas.setSelectedIndex(2);
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play22ActionPerformed

private void play23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play23ActionPerformed
    borrartodo();        
    opcion=23;
    equipoa1.setText(sf1.getText());
    equipoa2.setText(sf1.getText());
    equipoa3.setText(sf1.getText());
    equipob1.setText(sf2.getText());
    equipob2.setText(sf2.getText());
    equipob3.setText(sf2.getText());
    reconocerequipo(sf1.getText(),sf2.getText());
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play23.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play23ActionPerformed

private void play24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play24ActionPerformed
    borrartodo();        
    opcion=24;
    equipoa1.setText(sf3.getText());
    equipoa2.setText(sf3.getText());
    equipoa3.setText(sf3.getText());
    equipob1.setText(sf4.getText());
    equipob2.setText(sf4.getText());
    equipob3.setText(sf4.getText());
    reconocerequipo(sf3.getText(),sf4.getText());
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play24.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play24ActionPerformed

private void play25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play25ActionPerformed
    borrartodo();        
    opcion=25;
    equipoa1.setText(tq1.getText());
    equipoa2.setText(tq1.getText());
    equipoa3.setText(tq1.getText());
    equipob1.setText(tq2.getText());
    equipob2.setText(tq2.getText());
    equipob3.setText(tq2.getText());
    reconocerequipo(tq1.getText(),tq2.getText());
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play25.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play25ActionPerformed

private void play26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play26ActionPerformed
    borrartodo();        
    opcion=26;
    equipoa1.setText(f1.getText());
    equipoa2.setText(f1.getText());
    equipoa3.setText(f1.getText());
    equipob1.setText(f2.getText());
    equipob2.setText(f2.getText());
    equipob3.setText(f2.getText());
    reconocerequipo(f1.getText(),f2.getText());
    // coloca nombre de equipos en gamecast
    empezar.setEnabled(true);
    play26.setEnabled(false);
    // deshabilita boton play y habilita empezar juego
    fechas.setSelectedIndex(3);
    interfaz.setSelectedIndex(3);
}//GEN-LAST:event_play26ActionPerformed

private void penaltyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaltyActionPerformed
    penales1 = 0;
    penales2 = 0;
    penales1 = (int)(Math.round(Math.random()*5))+0;
    penales2 = (int)(Math.round(Math.random()*5))+0;
    while(penales1==penales2){
        penales1 = penales1 + (int)(Math.round(Math.random()*1))+0;
        penales2 = penales2 + (int)(Math.round(Math.random()*1))+0;
    }
    goles1.setText(Integer.toString(goleada1)+"("+Integer.toString(penales1)+")");
    goles2.setText("("+Integer.toString(penales2)+")"+Integer.toString(goleada2));
    penalty.setEnabled(false);
    terminar.setEnabled(true);
}//GEN-LAST:event_penaltyActionPerformed
    // metodo principal
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ama1;
    private javax.swing.JLabel ama10;
    private javax.swing.JLabel ama11;
    private javax.swing.JLabel ama12;
    private javax.swing.JLabel ama13;
    private javax.swing.JLabel ama14;
    private javax.swing.JLabel ama15;
    private javax.swing.JLabel ama16;
    private javax.swing.JLabel ama17;
    private javax.swing.JLabel ama18;
    private javax.swing.JLabel ama19;
    private javax.swing.JLabel ama2;
    private javax.swing.JLabel ama20;
    private javax.swing.JLabel ama21;
    private javax.swing.JLabel ama22;
    private javax.swing.JLabel ama23;
    private javax.swing.JLabel ama24;
    private javax.swing.JLabel ama25;
    private javax.swing.JLabel ama26;
    private javax.swing.JLabel ama27;
    private javax.swing.JLabel ama28;
    private javax.swing.JLabel ama29;
    private javax.swing.JLabel ama3;
    private javax.swing.JLabel ama30;
    private javax.swing.JLabel ama31;
    private javax.swing.JLabel ama32;
    private javax.swing.JLabel ama33;
    private javax.swing.JLabel ama34;
    private javax.swing.JLabel ama35;
    private javax.swing.JLabel ama36;
    private javax.swing.JLabel ama4;
    private javax.swing.JLabel ama5;
    private javax.swing.JLabel ama6;
    private javax.swing.JLabel ama7;
    private javax.swing.JLabel ama8;
    private javax.swing.JLabel ama9;
    private javax.swing.JLabel ata1;
    private javax.swing.JLabel ata2;
    private javax.swing.JLabel bandcuarto;
    private javax.swing.JLabel bandprimer;
    private javax.swing.JLabel bandsegun;
    private javax.swing.JLabel bandtercer;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel bola1;
    private javax.swing.JLabel bola10;
    private javax.swing.JLabel bola11;
    private javax.swing.JLabel bola12;
    private javax.swing.JLabel bola13;
    private javax.swing.JLabel bola14;
    private javax.swing.JLabel bola15;
    private javax.swing.JLabel bola16;
    private javax.swing.JLabel bola17;
    private javax.swing.JLabel bola18;
    private javax.swing.JLabel bola19;
    private javax.swing.JLabel bola2;
    private javax.swing.JLabel bola20;
    private javax.swing.JLabel bola21;
    private javax.swing.JLabel bola22;
    private javax.swing.JLabel bola23;
    private javax.swing.JLabel bola24;
    private javax.swing.JLabel bola25;
    private javax.swing.JLabel bola26;
    private javax.swing.JLabel bola27;
    private javax.swing.JLabel bola28;
    private javax.swing.JLabel bola29;
    private javax.swing.JLabel bola3;
    private javax.swing.JLabel bola30;
    private javax.swing.JLabel bola31;
    private javax.swing.JLabel bola32;
    private javax.swing.JLabel bola33;
    private javax.swing.JLabel bola34;
    private javax.swing.JLabel bola35;
    private javax.swing.JLabel bola36;
    private javax.swing.JLabel bola4;
    private javax.swing.JLabel bola5;
    private javax.swing.JLabel bola6;
    private javax.swing.JLabel bola7;
    private javax.swing.JLabel bola8;
    private javax.swing.JLabel bola9;
    private JEImagePanel calendario;
    private javax.swing.JTextField campeon;
    private JEImagePanel campo;
    private javax.swing.JTextField cuarto;
    private javax.swing.JLabel cuartos1;
    private javax.swing.JLabel cuartos2;
    private javax.swing.JLabel cuartos3;
    private javax.swing.JLabel cuartos4;
    private javax.swing.JLabel cuartos5;
    private javax.swing.JLabel cuartos6;
    private javax.swing.JLabel cuartos7;
    private javax.swing.JLabel cuartos8;
    private javax.swing.JLabel disp1;
    private javax.swing.JLabel disp2;
    private javax.swing.JButton empezar;
    private javax.swing.JLabel equipoa1;
    private javax.swing.JLabel equipoa2;
    private javax.swing.JLabel equipoa3;
    private javax.swing.JLabel equipob1;
    private javax.swing.JLabel equipob2;
    private javax.swing.JLabel equipob3;
    private JEImagePanel estadisticaequipo1;
    private JEImagePanel estadisticaequipo2;
    private JEImagePanel estadisticas;
    private javax.swing.JTabbedPane estadisticasxequipo;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JLabel falt1;
    private javax.swing.JLabel falt2;
    private javax.swing.JTabbedPane fechas;
    private JEImagePanel ficha;
    private javax.swing.JLabel fj1;
    private javax.swing.JLabel fj2;
    private javax.swing.JTextField fre1;
    private javax.swing.JTextField fre2;
    private JEImagePanel gamecast;
    private javax.swing.JLabel goles1;
    private javax.swing.JLabel goles2;
    private javax.swing.JLabel granfinal1;
    private javax.swing.JLabel granfinal2;
    private javax.swing.JTable grupoa;
    private javax.swing.JTable grupob;
    private javax.swing.JTable grupoc;
    private JEImagePanel grupos;
    private javax.swing.JTabbedPane interfaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton penalty;
    private javax.swing.JLabel perdedores1;
    private javax.swing.JLabel perdedores2;
    private javax.swing.JButton play1;
    private javax.swing.JButton play10;
    private javax.swing.JButton play11;
    private javax.swing.JButton play12;
    private javax.swing.JButton play13;
    private javax.swing.JButton play14;
    private javax.swing.JButton play15;
    private javax.swing.JButton play16;
    private javax.swing.JButton play17;
    private javax.swing.JButton play18;
    private javax.swing.JButton play19;
    private javax.swing.JButton play2;
    private javax.swing.JButton play20;
    private javax.swing.JButton play21;
    private javax.swing.JButton play22;
    private javax.swing.JButton play23;
    private javax.swing.JButton play24;
    private javax.swing.JButton play25;
    private javax.swing.JButton play26;
    private javax.swing.JButton play3;
    private javax.swing.JButton play4;
    private javax.swing.JButton play5;
    private javax.swing.JButton play6;
    private javax.swing.JButton play7;
    private javax.swing.JButton play8;
    private javax.swing.JButton play9;
    private javax.swing.JTextField qf1;
    private javax.swing.JTextField qf2;
    private javax.swing.JTextField qf3;
    private javax.swing.JTextField qf4;
    private javax.swing.JTextField qf5;
    private javax.swing.JTextField qf6;
    private javax.swing.JTextField qf7;
    private javax.swing.JTextField qf8;
    private javax.swing.JTextField qfre1;
    private javax.swing.JTextField qfre2;
    private javax.swing.JTextField qfre3;
    private javax.swing.JTextField qfre4;
    private javax.swing.JTextField qfre5;
    private javax.swing.JTextField qfre6;
    private javax.swing.JTextField qfre7;
    private javax.swing.JTextField qfre8;
    private javax.swing.JTextField ra1;
    private javax.swing.JTextField ra2;
    private javax.swing.JTextField rb1;
    private javax.swing.JTextField rb2;
    private javax.swing.JTextField rc1;
    private javax.swing.JTextField rc2;
    private javax.swing.JTextField rd1;
    private javax.swing.JTextField rd2;
    private javax.swing.JTextField re1;
    private javax.swing.JTextField re2;
    private javax.swing.JTextField rf1;
    private javax.swing.JTextField rf2;
    private javax.swing.JTextField rg1;
    private javax.swing.JTextField rg2;
    private javax.swing.JTextField rh1;
    private javax.swing.JTextField rh2;
    private javax.swing.JTextField ri1;
    private javax.swing.JTextField ri2;
    private javax.swing.JTextField rj1;
    private javax.swing.JTextField rj2;
    private javax.swing.JTextField rk1;
    private javax.swing.JTextField rk2;
    private javax.swing.JTextField rl1;
    private javax.swing.JTextField rl2;
    private javax.swing.JTextField rm1;
    private javax.swing.JTextField rm2;
    private javax.swing.JTextField rn1;
    private javax.swing.JTextField rn2;
    private javax.swing.JTextField ro1;
    private javax.swing.JTextField ro2;
    private javax.swing.JLabel rojito1;
    private javax.swing.JLabel rojito10;
    private javax.swing.JLabel rojito11;
    private javax.swing.JLabel rojito12;
    private javax.swing.JLabel rojito13;
    private javax.swing.JLabel rojito14;
    private javax.swing.JLabel rojito15;
    private javax.swing.JLabel rojito16;
    private javax.swing.JLabel rojito17;
    private javax.swing.JLabel rojito18;
    private javax.swing.JLabel rojito19;
    private javax.swing.JLabel rojito2;
    private javax.swing.JLabel rojito20;
    private javax.swing.JLabel rojito21;
    private javax.swing.JLabel rojito22;
    private javax.swing.JLabel rojito23;
    private javax.swing.JLabel rojito24;
    private javax.swing.JLabel rojito25;
    private javax.swing.JLabel rojito26;
    private javax.swing.JLabel rojito27;
    private javax.swing.JLabel rojito28;
    private javax.swing.JLabel rojito29;
    private javax.swing.JLabel rojito3;
    private javax.swing.JLabel rojito30;
    private javax.swing.JLabel rojito31;
    private javax.swing.JLabel rojito32;
    private javax.swing.JLabel rojito33;
    private javax.swing.JLabel rojito34;
    private javax.swing.JLabel rojito35;
    private javax.swing.JLabel rojito36;
    private javax.swing.JLabel rojito4;
    private javax.swing.JLabel rojito5;
    private javax.swing.JLabel rojito6;
    private javax.swing.JLabel rojito7;
    private javax.swing.JLabel rojito8;
    private javax.swing.JLabel rojito9;
    private javax.swing.JTextField rp1;
    private javax.swing.JTextField rp2;
    private javax.swing.JTextField rq1;
    private javax.swing.JTextField rq2;
    private javax.swing.JTextField rr1;
    private javax.swing.JTextField rr2;
    private javax.swing.JTextField rs1;
    private javax.swing.JTextField rs2;
    private javax.swing.JTextField rt1;
    private javax.swing.JTextField rt2;
    private javax.swing.JTextField ru1;
    private javax.swing.JTextField ru2;
    private javax.swing.JTextField rv1;
    private javax.swing.JTextField rv2;
    private javax.swing.JTextField rw1;
    private javax.swing.JTextField rw2;
    private javax.swing.JTextField rx1;
    private javax.swing.JTextField rx2;
    private javax.swing.JTextField ry1;
    private javax.swing.JTextField ry2;
    private javax.swing.JTextField rz1;
    private javax.swing.JTextField rz2;
    private JEImagePanel sede;
    private javax.swing.JLabel semis1;
    private javax.swing.JLabel semis2;
    private javax.swing.JLabel semis3;
    private javax.swing.JLabel semis4;
    private javax.swing.JTextField sf1;
    private javax.swing.JTextField sf2;
    private javax.swing.JTextField sf3;
    private javax.swing.JTextField sf4;
    private javax.swing.JTextField sfre1;
    private javax.swing.JTextField sfre2;
    private javax.swing.JTextField sfre3;
    private javax.swing.JTextField sfre4;
    private javax.swing.JTextField subcampeon;
    private javax.swing.JTable suplente1;
    private javax.swing.JTable suplente2;
    private javax.swing.JLabel ta1;
    private javax.swing.JLabel ta2;
    private javax.swing.JTextField tercer;
    private javax.swing.JButton terminar;
    private javax.swing.JProgressBar tiempo;
    private javax.swing.JLabel tiro1;
    private javax.swing.JLabel tiro2;
    private javax.swing.JTable titular1;
    private javax.swing.JTable titular2;
    private javax.swing.JLabel tp1;
    private javax.swing.JLabel tp2;
    private javax.swing.JTextField tq1;
    private javax.swing.JTextField tq2;
    private javax.swing.JTextField tqre1;
    private javax.swing.JTextField tqre2;
    private javax.swing.JLabel tr1;
    private javax.swing.JLabel tr2;
    // End of variables declaration//GEN-END:variables
}
