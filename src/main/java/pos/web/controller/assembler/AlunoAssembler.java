package pos.web.controller.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pos.web.controller.dto.AlunoDto;
import pos.web.domain.entity.Aluno;

import java.util.List;

@Component
public class AlunoAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	
	public AlunoDto alunoDto(Aluno aluno) {
		return modelMapper.map(aluno, AlunoDto.class);
	}
	
	public List<AlunoDto> alunosDto(List<Aluno> alunos) {
		return alunos.stream().map(this::alunoDto).toList();
	}
}
