import React, { Component } from 'react';
import { View, requireNativeComponent, findNodeHandle, UIManager } from 'react-native';
import PropTypes from 'prop-types';

export default class Sh3hSynopticView extends Component{

    static propTypes = {
        ...View.propTypes,
        gravity: PropTypes.string,
        type: PropTypes.string,
        textColor: PropTypes.number
    };

    static defaultProps = {
        gravity: "center",
        type: "horizontal",
        textColor: 0xFFFF0000
    };

    constructor() {
        super();
    }

    componentDidMount(): void {
        console.log("componentDidMount");
        this.show();
    }

    show = () => {
        let reactTag = findNodeHandle(this);
        console.log(reactTag);
        let commandID = UIManager.SynopticNetworkView.Commands["show"];
        console.log(commandID);
        UIManager.dispatchViewManagerCommand(reactTag, commandID, []);
    }

    render() {
        return <SynopticNetworkView {...this.props} />;
    }

}

const SynopticNetworkView = requireNativeComponent('SynopticNetworkView');
