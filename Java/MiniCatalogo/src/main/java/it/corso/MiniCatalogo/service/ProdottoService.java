package it.corso.MiniCatalogo.service;

import java.util.List;

import it.corso.MiniCatalogo.dto.ProdottoRequest;
import it.corso.MiniCatalogo.dto.ProdottoResponse;
import it.corso.MiniCatalogo.mapper.ProdottoMapper;
import it.corso.MiniCatalogo.model.Prodotto;
import it.corso.MiniCatalogo.repository.ProdottoRepository;

public class ProdottoService {
	private final ProdottoRepository prodottoRepository;	
	public ProdottoService(ProdottoRepository r) {
		this.prodottoRepository = r;
	}
	
	public List<ProdottoResponse> trovaTutti(){
		return prodottoRepository.findAll()
				.stream()
				.map(ProdottoMapper::toResponse)
				.toList();
	}
	
	public ProdottoResponse trovaPerId(Long id) {
		Prodotto p = prodottoRepository 
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Prodotto non trovato:" + id));
		return ProdottoMapper.toResponse(p);
	}
	
	public void creaProdotto(ProdottoRequest request) {
		Prodotto p = ProdottoMapper.toModel(request);
		prodottoRepository.save(p);
	}

}
