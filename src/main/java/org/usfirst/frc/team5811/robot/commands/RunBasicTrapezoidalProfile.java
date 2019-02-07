package org.usfirst.frc.team5811.robot.commands;

import org.usfirst.frc.team5811.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import java.io.File;
import java.util.Scanner;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunBasicTrapezoidalProfile extends Command {

	//File voltageFile = new File()
	
	//60 Inches 100 in/s/s acceleration 40 in/s velocity
//	double[] voltages = {1.123582069871789, 1.276944131357713, 1.430306192843637, 1.5836682543295608, 1.7370303158154847, 1.8903923773014086, 2.0437544387873325, 2.1971165002732564, 2.3504785617591804, 2.5038406232451043, 2.657202684731028, 2.8105647462169516, 2.963926807702876, 3.1172888691888, 3.270650930674724, 3.4240129921606477, 3.5773750536465716, 3.7307371151324955, 3.8840991766184194, 4.037461238104344, 4.190823299590267, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 3.067241229718478, 1.7902970983607651, 1.6369350368748412, 1.4835729753889173, 1.3302109139029934, 1.1768488524170695, 1.0234867909311456, 0.8701247294452217, 0.7167626679592976, 0.5634006064733736, 0.41003854498744996, 0.25667648350152605, 0.10331442201560193, -0.0500476394703222, -0.2034097009562461, -0.35677176244217024, -0.5101338239280941, -0.6634958854140182, -0.8168579468999422, -0.9702200083858663, -1.1235820698717904};
//	double[] accelerations = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0};
//	double[] velocities = {0.0, 2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0, 36.0, 38.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 38.0, 36.0, 34.0, 32.0, 30.0, 28.0, 26.0, 24.0, 22.0, 20.0, 18.0, 15.999999999999998, 13.999999999999996, 11.999999999999995, 9.999999999999993, 7.999999999999991, 5.999999999999989, 3.9999999999999876, 1.9999999999999858, 0.0};
//	double[] positions = {0.0, 0.04, 0.12, 0.24, 0.4, 0.6000000000000001, 0.8400000000000001, 1.12, 1.44, 1.7999999999999998, 2.1999999999999997, 2.6399999999999997, 3.119999999999999, 3.639999999999999, 4.199999999999999, 4.8, 5.44, 6.120000000000001, 6.840000000000002, 7.600000000000002, 8.400000000000002, 9.200000000000003, 10.000000000000004, 10.800000000000004, 11.600000000000005, 12.400000000000004, 13.200000000000005, 14.000000000000005, 14.800000000000006, 15.600000000000007, 16.400000000000006, 17.200000000000006, 18.000000000000007, 18.800000000000008, 19.60000000000001, 20.40000000000001, 21.20000000000001, 22.00000000000001, 22.80000000000001, 23.600000000000012, 24.400000000000013, 25.200000000000014, 26.000000000000014, 26.800000000000015, 27.600000000000016, 28.400000000000016, 29.200000000000017, 30.000000000000018, 30.80000000000002, 31.60000000000002, 32.40000000000001, 33.20000000000002, 34.000000000000014, 34.80000000000001, 35.60000000000001, 36.400000000000006, 37.2, 38.0, 38.8, 39.599999999999994, 40.39999999999999, 41.19999999999999, 41.999999999999986, 42.79999999999998, 43.59999999999998, 44.39999999999998, 45.199999999999974, 45.99999999999997, 46.79999999999997, 47.599999999999966, 48.39999999999996, 49.19999999999996, 49.99999999999996, 50.799999999999955, 51.59999999999995, 52.39999999999995, 53.15999999999995, 53.879999999999946, 54.559999999999945, 55.199999999999946, 55.79999999999995, 56.35999999999995, 56.87999999999995, 57.35999999999996, 57.799999999999955, 58.19999999999995, 58.55999999999995, 58.87999999999995, 59.159999999999954, 59.399999999999956, 59.59999999999996, 59.759999999999955, 59.87999999999995, 59.95999999999995, 59.99999999999995, 59.99999999999995};
	
	//80 inches 100 in/s/s acceleration	80 in/s velocity
//	double[] voltages = {1.123582069871789, 1.276944131357713, 1.430306192843637, 1.5836682543295608, 1.7370303158154847, 1.8903923773014086, 2.0437544387873325, 2.1971165002732564, 2.3504785617591804, 2.5038406232451043, 2.657202684731028, 2.8105647462169516, 2.963926807702876, 3.1172888691888, 3.270650930674724, 3.4240129921606477, 3.5773750536465716, 3.7307371151324955, 3.8840991766184194, 4.037461238104344, 4.190823299590267, 4.344185361076191, 4.497547422562114, 4.6509094840480385, 4.804271545533963, 4.957633607019886, 5.11099566850581, 5.264357729991734, 5.417719791477658, 5.571081852963582, 5.724443914449505, 5.87780597593543, 6.031168037421353, 6.1845300989072785, 6.337892160393202, 6.491254221879126, 6.64461628336505, 6.797978344850974, 6.9513404063368975, 7.104702467822822, 7.258064529308745, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 6.134482459436956, 4.857538328079244, 4.704176266593319, 4.550814205107396, 4.3974521436214715, 4.244090082135548, 4.090728020649624, 3.9373659591637002, 3.784003897677776, 3.6306418361918524, 3.477279774705928, 3.3239177132200046, 3.1705556517340803, 3.017193590248157, 2.8638315287622325, 2.710469467276308, 2.557107405790384, 2.4037453443044603, 2.2503832828185364, 2.097021221332613, 1.943659159846689, 1.7902970983607651, 1.6369350368748412, 1.4835729753889173, 1.3302109139029934, 1.1768488524170695, 1.0234867909311456, 0.8701247294452217, 0.7167626679592976, 0.5634006064733736, 0.41003854498744996, 0.25667648350152605, 0.10331442201560193, -0.0500476394703222, -0.2034097009562461, -0.35677176244217024, -0.5101338239280941, -0.6634958854140182, -0.8168579468999422, -0.9702200083858663, -1.1235820698717904};
//	double[] accelerations = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0, -100.0};
//	double[] velocities = {0.0, 2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0, 36.0, 38.0, 40.0, 42.0, 44.0, 46.0, 48.0, 49.99999999999999, 51.99999999999999, 53.99999999999999, 55.99999999999999, 57.99999999999999, 59.99999999999999, 61.99999999999999, 63.99999999999999, 66.0, 68.0, 70.0, 72.0, 74.0, 76.0, 78.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 78.0, 76.0, 74.0, 72.0, 70.0, 68.0, 66.0, 64.0, 62.0, 60.0, 58.0, 56.0, 54.0, 52.0, 50.0, 48.0, 46.0, 44.0, 42.0, 40.0, 38.0, 36.0, 34.0, 32.0, 30.0, 28.0, 26.0, 24.0, 22.0, 20.0, 18.0, 15.999999999999998, 13.999999999999996, 11.999999999999995, 9.999999999999993, 7.999999999999991, 5.999999999999989, 3.9999999999999876, 1.9999999999999858, 0.0};
//	double[] positions = {0.0, 0.04, 0.12, 0.24, 0.4, 0.6000000000000001, 0.8400000000000001, 1.12, 1.44, 1.7999999999999998, 2.1999999999999997, 2.6399999999999997, 3.119999999999999, 3.639999999999999, 4.199999999999999, 4.8, 5.44, 6.120000000000001, 6.840000000000002, 7.600000000000002, 8.400000000000002, 9.240000000000002, 10.120000000000003, 11.040000000000003, 12.000000000000004, 13.000000000000002, 14.040000000000003, 15.120000000000003, 16.240000000000002, 17.400000000000002, 18.6, 19.840000000000003, 21.120000000000005, 22.440000000000005, 23.800000000000004, 25.200000000000006, 26.640000000000008, 28.120000000000008, 29.640000000000008, 31.20000000000001, 32.80000000000001, 34.40000000000001, 36.000000000000014, 37.600000000000016, 39.20000000000002, 40.80000000000002, 42.40000000000002, 44.00000000000002, 45.60000000000002, 47.200000000000024, 48.80000000000002, 50.36000000000002, 51.880000000000024, 53.36000000000003, 54.800000000000026, 56.200000000000024, 57.560000000000024, 58.880000000000024, 60.160000000000025, 61.40000000000003, 62.60000000000003, 63.76000000000003, 64.88000000000004, 65.96000000000004, 67.00000000000004, 68.00000000000004, 68.96000000000004, 69.88000000000004, 70.76000000000003, 71.60000000000004, 72.40000000000003, 73.16000000000004, 73.88000000000004, 74.56000000000004, 75.20000000000005, 75.80000000000004, 76.36000000000004, 76.88000000000004, 77.36000000000004, 77.80000000000004, 78.20000000000005, 78.56000000000004, 78.88000000000004, 79.16000000000004, 79.40000000000003, 79.60000000000004, 79.76000000000003, 79.88000000000004, 79.96000000000004, 80.00000000000004, 80.00000000000004};
	
	//160 inches 150 in/s/s acceleration 120 in/s velocity //Skrt, skrt
	double[] voltages = {1.6853731048076839, 1.9154161970365697, 2.1454592892654554, 2.3755023814943415, 2.605545473723227, 2.835588565952113, 3.0656316581809993, 3.295674750409885, 3.5257178426387705, 3.7557609348676566, 3.9858040270965427, 4.215847119325429, 4.445890211554314, 4.6759333037832, 4.905976396012086, 5.136019488240971, 5.366062580469857, 5.5961056726987435, 5.82614876492763, 6.056191857156516, 6.286234949385401, 6.516278041614287, 6.746321133843173, 6.976364226072059, 7.206407318300944, 7.43645041052983, 7.666493502758716, 7.8965365949876025, 8.126579687216488, 8.356622779445374, 8.58666587167426, 8.816708963903146, 9.04675205613203, 9.276795148360916, 9.506838240589802, 9.73688133281869, 9.966924425047576, 10.196967517276462, 10.427010609505349, 10.657053701734233, 10.887096793963119, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 9.201723689155434, 7.286307492118865, 7.05626439988998, 6.826221307661094, 6.596178215432208, 6.366135123203322, 6.136092030974435, 5.906048938745549, 5.676005846516663, 5.445962754287778, 5.215919662058892, 4.985876569830006, 4.75583347760112, 4.525790385372235, 4.295747293143349, 4.065704200914463, 3.835661108685577, 3.6056180164566918, 3.3755749242278057, 3.1455318319989196, 2.9154887397700335, 2.6854456475411483, 2.4554025553122623, 2.2253594630833753, 1.9953163708544894, 1.7652732786256038, 1.5352301863967182, 1.3051870941678325, 1.0751440019389464, 0.8451009097100608, 0.6150578174811743, 0.3850147252522882, 0.1549716330234021, -0.07507145920548397, -0.3051145514343703, -0.5351576436632564, -0.7652007358921423, -0.9952438281210284, -1.2252869203499146, -1.4553300125788007, -1.6853731048076868};
	double[] accelerations = {150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0, -150.0};
	double[] velocities = {0.0, 3.0, 6.0, 9.0, 12.0, 15.0, 18.0, 21.0, 24.0, 27.0, 30.0, 33.0, 36.0, 39.0, 42.0, 45.0, 48.0, 51.0, 54.0, 57.0, 60.0, 63.0, 66.0, 69.0, 72.0, 75.0, 78.0, 81.0, 84.0, 87.0, 90.0, 93.0, 96.0, 99.0, 102.0, 105.0, 108.0, 111.0, 114.0, 117.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 120.0, 117.0, 114.0, 111.0, 108.0, 105.0, 102.0, 99.0, 96.0, 93.0, 90.0, 87.0, 84.0, 81.0, 78.0, 75.0, 72.0, 69.0, 66.0, 63.0, 60.0, 57.0, 54.0, 51.0, 48.0, 45.0, 42.0, 39.0, 36.0, 33.0, 29.999999999999996, 26.999999999999993, 23.99999999999999, 20.999999999999986, 17.999999999999982, 14.999999999999979, 11.999999999999975, 8.999999999999972, 5.999999999999969, 2.9999999999999662, -3.6415315207705135E-14};
	double[] positions = {0.0, 0.06, 0.18, 0.36, 0.6000000000000001, 0.9000000000000001, 1.2600000000000002, 1.6800000000000004, 2.16, 2.6999999999999997, 3.2999999999999994, 3.959999999999999, 4.679999999999999, 5.459999999999998, 6.299999999999999, 7.199999999999999, 8.16, 9.180000000000001, 10.260000000000002, 11.400000000000002, 12.600000000000003, 13.860000000000005, 15.180000000000007, 16.56000000000001, 18.00000000000001, 19.500000000000007, 21.06000000000001, 22.68000000000001, 24.360000000000014, 26.100000000000016, 27.900000000000016, 29.76000000000002, 31.68000000000002, 33.660000000000025, 35.700000000000024, 37.800000000000026, 39.96000000000003, 42.18000000000003, 44.46000000000003, 46.80000000000003, 49.20000000000003, 51.60000000000004, 54.00000000000004, 56.40000000000005, 58.800000000000054, 61.20000000000006, 63.600000000000065, 66.00000000000007, 68.40000000000008, 70.80000000000008, 73.20000000000007, 75.60000000000008, 78.00000000000009, 80.40000000000009, 82.8000000000001, 85.2000000000001, 87.60000000000011, 90.00000000000011, 92.40000000000012, 94.80000000000013, 97.20000000000013, 99.60000000000014, 102.00000000000014, 104.40000000000015, 106.80000000000015, 109.20000000000016, 111.60000000000016, 114.00000000000017, 116.34000000000017, 118.62000000000018, 120.84000000000017, 123.00000000000017, 125.10000000000018, 127.14000000000019, 129.12000000000018, 131.0400000000002, 132.9000000000002, 134.70000000000022, 136.44000000000023, 138.12000000000023, 139.74000000000024, 141.30000000000024, 142.80000000000024, 144.24000000000024, 145.62000000000023, 146.94000000000023, 148.20000000000022, 149.4000000000002, 150.54000000000022, 151.62000000000023, 152.64000000000024, 153.60000000000025, 154.50000000000026, 155.34000000000026, 156.12000000000026, 156.84000000000026, 157.50000000000026, 158.10000000000025, 158.64000000000024, 159.12000000000023, 159.54000000000022, 159.90000000000023, 160.20000000000024, 160.44000000000025, 160.62000000000026, 160.74000000000026, 160.80000000000027, 160.80000000000027};
	
	int counter = 0;
	boolean profileComplete = false;
	
	double startTimestamp, currentTimestamp, previousTimestamp;
	double acceleration, velocity, position, previousVelocity = 0, previousPosition = 0;
	double twoPreviousVelocity = 0, twoPreviousTimestamp = 0;
	double dt, dt2;
	
	double vIntercept = 0.8;
	double feedForwardVoltage = 0.0;
	double outputVoltage = 0.0;
	
	double posError = 0.0, velError = 0.0, accError = 0.0;
	double kpPos = 0.6;
	double kpVel = 0.1;
	double kpAcc = 0.0;
	
    public RunBasicTrapezoidalProfile() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSUB);
        requires(Robot.encoders);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startTimestamp = Timer.getFPGATimestamp();
    	previousTimestamp = startTimestamp;
    	Robot.encoders.reset();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(counter < voltages.length) {
    		
    		
    		
    		currentTimestamp = Timer.getFPGATimestamp() - startTimestamp;
    		dt = currentTimestamp - previousTimestamp;
    		dt2 = currentTimestamp - twoPreviousTimestamp;
    	
    		position = Robot.encoders.getLeftVal()/Robot.driveSUB.inchToPulse;
    		velocity = (position - previousPosition) / dt;
    		acceleration = (velocity - previousVelocity) / dt;
    		
    		posError = positions[counter] - position;
    		velError = velocities[counter] - velocity;
    		accError = accelerations[counter]- acceleration;
    		
    		if(voltages[counter] > 0) { //directional friction
    			feedForwardVoltage = voltages[counter] + vIntercept;
    		} else {
    			feedForwardVoltage = voltages[counter] - vIntercept;
    		}
    		outputVoltage = feedForwardVoltage + kpPos * posError + kpVel * velError + kpAcc * accError;
    		
    		Robot.driveSUB.voltageDrive(outputVoltage, outputVoltage);
    		//Robot.driveSUB.justFreakingDrive(voltages[counter]/12);
    		
    		twoPreviousTimestamp = previousTimestamp;
    		twoPreviousVelocity = previousVelocity;
    	
    		previousTimestamp = currentTimestamp;
    		previousPosition = position;
    		previousVelocity = velocity;
  	 	
    		System.out.println(currentTimestamp + " " + acceleration + " " + velocity + " " + position); // + " " + Robot.driveSUB.monitorBatteryVoltage());
    		counter++;
    	} else {
    		Robot.driveSUB.fullStop();
    		position = Robot.encoders.getLeftVal()/Robot.driveSUB.inchToPulse;
    		currentTimestamp = Timer.getFPGATimestamp() - startTimestamp;
    		System.out.println(currentTimestamp + " " + position);
    		//profileComplete = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return profileComplete;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSUB.fullStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
