# connectCode
fighting



리눅스에서 gradle로 빌드가 안되는 문제를 3일째 해결하지 못하고있다...
개행 문자가 원인이 될 수 있다는 정보를 입수했다.

다행히 깃에서 개행문자 처리를 해준다고한다
git config --global core.autocrlf true
설정을 해주면 윈도우환경에서 작업하고 리눅스에 배포할 때를 의미한다.
로컬에서 원격으로 푸쉬할 때는 리눅스 개행문자(LF)로 처리해주고
원격에서 로컬로 풀 할 떄는 윈도우 개행문자(CRLF)로 처리해준다고 한다.


