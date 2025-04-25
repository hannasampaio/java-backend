package br.com.sampaioh.service;

public interface IContratoService {
    String salvar();
    String buscar(Long id);
    String excluir(Long id);
    String atualizar(Long id, String novoContrato);
}