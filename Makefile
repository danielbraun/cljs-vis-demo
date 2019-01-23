repl:
	clj -A:nREPL \
	    --main nrepl.cmdline \
	    --interactive \
	    --color \
	    --middleware "[cider.nrepl/cider-middleware cider.piggieback/wrap-cljs-repl]"
