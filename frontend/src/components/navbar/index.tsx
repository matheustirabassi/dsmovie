import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './styles.css';

function NavBar() {
	return (
		<header>
			<nav className='container'>
				<div className='dsmovie-nav-content'> 
					<h1>DSMovie</h1>
					<a href='https://github.com/matheustirabassi' target="_blank" rel="noreferrer noopener">
						<div className='dsmovie-contact-container'>
							<GithubIcon />
							<p className='dsmovie-contact-link'>/matheustirabassi</p>
						</div>
					</a>
				</div>
				<div></div>
			</nav>
		</header>
	);
}

export default NavBar;
