FROM clojure:lein-alpine AS clojure

LABEL maintainer "Rintaro Okamura <rintaro.okamura@gmail.com>"

ENV LANG ja_JP.UTF-8
ENV TZ Asia/Tokyo
ENV HOME /root

WORKDIR $HOME

COPY project.clj $HOME/project.clj

RUN lein deps

COPY src $HOME/src
COPY test $HOME/test
COPY dev $HOME/dev

ENTRYPOINT ["lein"]
CMD ["repl", ":start", ":host", "0.0.0.0", ":port", "8080"]
