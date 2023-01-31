package pos.web.controller.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pos.web.controller.dto.CursoDto;
import pos.web.domain.entity.Curso;

import java.util.List;

@Component
public class CursoAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public CursoDto cursoDto(Curso curso) {
		return modelMapper.map(curso, CursoDto.class);
	}
	
	public List<CursoDto> cursosDto(List<Curso> cursos) {
		return cursos.stream().map(this::cursoDto).toList();
	}
	
}
