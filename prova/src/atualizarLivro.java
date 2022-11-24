@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Livro livro) {
		livroRepository.save(livro);
	}