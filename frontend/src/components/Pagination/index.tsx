import { ReactComponent as Arrow } from 'assets/img/arrow.svg'
import './styles.css'

function Pagination() {
	return (
		<div className="dsmovie-pagination-container">
			<div className="dsmovie-pagination-box">
				<button type="button" className="dsmovie-pagination-button" aria-label="btn-back" disabled={true}>
					<Arrow />
				</button>
				<p>{`${1} de ${3}`}</p>
				<button type="button" className="dsmovie-pagination-button" aria-label="btn-next" disabled={false}>
					<Arrow className="dsmovie-flip-horizontal" />
				</button>
			</div>
		</div>
	);
}

export default Pagination;
