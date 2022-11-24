
    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros/{isbn}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable Long isbn){

	    livroRepository.deleteById(isbn);

    }