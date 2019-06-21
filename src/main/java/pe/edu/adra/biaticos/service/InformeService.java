package pe.edu.adra.biaticos.service;

import pe.edu.adra.biaticos.entities.Informe.Informe;

public interface InformeService {
	
	Informe saveInforme(Informe informe);

	void deleteInforme(Long id);
	
}
