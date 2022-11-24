@ResponseBody
	@RequestMapping("/livros")
	public List<Livro> listar() {
		List<Livro> livros = livroRepository.findAll();
		return livros;
	}