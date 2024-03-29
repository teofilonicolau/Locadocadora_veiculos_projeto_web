package tech.ada.locadoraveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.ada.locadoraveiculos.model.Veiculo;
import tech.ada.locadoraveiculos.repository.VeiculoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public void createVeiculo(Veiculo veiculo){
        this.veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return this.
                veiculoRepository.findAll();
    }

    public Page<Veiculo> listarPaginado(Integer numeroPagina, Integer tamanhoPagina) {
        return this.veiculoRepository
                   .findAll(PageRequest.of(numeroPagina, tamanhoPagina, Sort.by(Sort.Order.asc("id"))));
    }

    public Optional<Veiculo> buscarVeiculoPorId(Long id) {
        return this.veiculoRepository.findById(id);
    }

    public Optional<Veiculo> buscarVeiculoPelaPlaca(String placa) {
        return this.veiculoRepository.findByPlacaContaining(placa);
    }

    public void removerVeiculoPorId(Long id) {
        this.veiculoRepository.deleteById(id);
    }
}
